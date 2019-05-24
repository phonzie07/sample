package com.sample.controllers;

import com.generic.core.base.response.EndpointResult;
import com.sample.model.TestRequestModel;
import com.sample.service.impl.SampleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
public class TestController {

    @Autowired
    private SampleService sampleService;


    /**
     * Test config.
     *
     * @param request the request
     * @return the response
     */
    @PostMapping("test")
    public EndpointResult test(@RequestBody TestRequestModel request) {
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.test(request));
        return result;
    }

    /**
     * save entity.
     *
     * @param request the request
     * @return the response
     */
    @PostMapping("save")
    public EndpointResult save(@RequestBody TestRequestModel request) {
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.save(request));
        return result;
    }

    /**
     * get entity by id.
     *
     * @param id the request
     * @return the response
     */
    @GetMapping("get")
    public EndpointResult get(@RequestParam("id") Long id) {
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.get(id));
        return result;
    }

    /**
     * get entity by name.
     *
     * @param name the request
     * @return the response
     */
    @GetMapping("getByName")
    public EndpointResult getByName(@RequestParam("name") String name) {
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.getByName(name));
        return result;
    }
}
