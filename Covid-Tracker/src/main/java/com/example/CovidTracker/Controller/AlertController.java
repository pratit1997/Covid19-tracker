package com.example.CovidTracker.Controller;

import com.example.CovidTracker.Controller.dto.AlerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertController {
    @Autowired
    private AlertService alertService;


    @GetMapping("india/{state}")
    AlerStatus getAlertAboutStates(@PathVariable String States ){
        return alertService.getAlertAboutState(States);
    }
}

