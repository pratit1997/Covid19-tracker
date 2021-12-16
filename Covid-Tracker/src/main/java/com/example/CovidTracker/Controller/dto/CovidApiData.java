package com.example.CovidTracker.Controller.dto;

import java.time.ZonedDateTime;

public class CovidApiData {
    private Boolean success;
    private CountryData data;
   private ZonedDateTime  lastRefreshed,lastOriginUpdate;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public CountryData getData() {
        return data;
    }

    public void setData(CountryData data) {
        this.data = data;
    }

    public ZonedDateTime getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(ZonedDateTime lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public ZonedDateTime getLastOriginUpdate() {
        return lastOriginUpdate;
    }

    public void setLastOriginUpdate(ZonedDateTime lastOriginUpdate) {
        this.lastOriginUpdate = lastOriginUpdate;
    }
}
