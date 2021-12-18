package com.example.CovidTracker.Controller;

import com.example.CovidTracker.Controller.dto.AlerStatus;
import com.example.CovidTracker.Controller.dto.SummaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class AlertService {
    @Autowired
    private Covid19DataProvider covid19DataProvider ;
    AlerStatus alertStatus=new AlerStatus();
    public AlerStatus getAlertAboutState(String states) {
        StateData stateData=covid19DataProvider.getStateData(states);
        if(stateData.getTotalConfirmed()<1000){
            alertStatus.setAlertLevel("GREEN");
            alertStatus.setMeasuresToBeTaken(Arrays.asList("Every this is Normal"));
        }else if(stateData.getTotalConfirmed()>1000&& stateData.getTotalConfirmed()<5000){
            alertStatus.setAlertLevel("Orange");
            alertStatus.setMeasuresToBeTaken(Arrays.asList("take some prevention measures to make sure the situation doesn't get worse"));
        }else{
            alertStatus.setAlertLevel("RED");
            alertStatus.setMeasuresToBeTaken(Arrays.asList("The state is on red alert and need strict meauseres "));
        }
        return alertStatus;
    }

    public SummaryData getOverAllSummary() {

            return covid19DataProvider.getSummary("summary");
    }
}
