package com.example.CovidTracker.Controller.dto;

import java.util.List;

public class AlerStatus {
    static  String alertLevel;        //red,green,orange
    List<String> measuresToBeTaken;

    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public List<String> getMeasuresToBeTaken() {
        return measuresToBeTaken;
    }

    public void setMeasuresToBeTaken(List<String> measuresToBeTaken) {
        this.measuresToBeTaken = measuresToBeTaken;
    }
}

