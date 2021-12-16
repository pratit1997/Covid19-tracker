package com.example.CovidTracker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Covid19DataProvider {
    final String url="https://api.rootnet.in/covid19-in/stats/latest";
    @Autowired
    RestTemplate restTemplate;

    StateData getStateData(String State){
restTemplate.getForObject(url,StateData.class);

//Start worKing from here
    }
}
