package com.przemo.conference.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;


@Component
@Endpoint(id = "readiness")
public class ReadinessEndpoint {

    private String ready = "NOT_READY";

    @ReadOperation
    public String getReadiness() {
        return ready;
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void setReady() {
//        ready = "READY";
//    }
}
