package com.example.CovidTracker.Controller;

import com.example.CovidTracker.Controller.dto.AlerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class AlertService {
    @Autowired
    private Covid19DataProvider covid19DataProvider ;
    public AlerStatus getAlertAboutState(String states) {
        AlerStatus alertStatus=new AlerStatus();
        alertStatus.setAlertLevel("GREEN");
        alertStatus.setMeasuresToBeTaken(Arrays.asList("Every this is Normal"));
        return alertStatus;
    }
}
