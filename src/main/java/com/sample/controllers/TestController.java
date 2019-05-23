package com.sample.controllers;

import com.generic.core.base.response.EndpointResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log4j2
@RestController
public class TestController {

    @Value("${spring.datasource.driverClassName}")
    private String test;
    /**
     * Post response entity.
     *
     * @param request the request
     * @return the response entity
     */
    @PostMapping("test")
    public EndpointResult test(@RequestBody Map<String, Object> request) {
        EndpointResult result = new EndpointResult();
        result.addData(test);
        return result;
    }
}
