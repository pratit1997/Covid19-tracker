package com.example.CovidTracker.Controller;

import com.example.CovidTracker.Controller.dto.CovidApiData;
import com.example.CovidTracker.Controller.dto.SummaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class Covid19DataProvider {
    final String url="https://api.rootnet.in/covid19-in/stats/latest";
    @Autowired
    RestTemplate restTemplate;

    StateData getStateData(String State){
CovidApiData covidApiData=restTemplate.getForObject(url, CovidApiData.class);
//covidApiData.getData().getRegional();
       return Arrays.stream(covidApiData.getData().getRegional()).filter(e->
               e.getLoc().equalsIgnoreCase(State)).findAny().orElse(new StateData());

//Start worKing from here
    }

    public SummaryData getSummary(String summary) {
        CovidApiData covidApiData=restTemplate.getForObject(url, CovidApiData.class);
        SummaryData summaryData=covidApiData.getData().getSummary();
        summaryData.setUpdateTime(covidApiData.getLastRefreshed());
        return summaryData ;
    }
}
