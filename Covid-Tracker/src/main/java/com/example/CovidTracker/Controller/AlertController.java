package com.example.CovidTracker.Controller;

import com.example.CovidTracker.Controller.dto.AlerStatus;
import com.example.CovidTracker.Controller.dto.SummaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/india/")
public class AlertController {
    @Autowired
    private AlertService alertService;


    @GetMapping("/{states}")
    AlerStatus getAlertAboutStates(@PathVariable String states ){
        return alertService.getAlertAboutState(states);
    }
    @GetMapping("/summary")
    SummaryData OverAllSummary() {


        return alertService.getOverAllSummary();
    }
    @GetMapping("/error")
    String error(){
        return "Some Error Encountered";
    }
}

