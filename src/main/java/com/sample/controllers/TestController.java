package com.sample.controllers;

import com.generic.core.base.response.EndpointResult;
import com.sample.model.TestRequestModel;
import com.sample.model.entity.Company;
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
        log.info("TestController test:");
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
        log.info("TestController save:");
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.saveTest(request));
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
        log.info("TestController get:");
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.getTestById(id));
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
        log.info("TestController getByName:");
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.getTestByName(name));
        return result;
    }

    /**
     * save entity.
     *
     * @param request the request
     * @return the response
     */
    @PostMapping("saveCompany")
    public EndpointResult saveCompany(@RequestBody Company request) {
        log.info("TestController saveCompany:");
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.saveCompany(request));
        return result;
    }

    /**
     * get entity by id.
     *
     * @param id the request
     * @return the response
     */
    @GetMapping("getCompanyById")
    public EndpointResult getCompany(@RequestParam("id") Long id) {
        log.info("TestController getCompany:");
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.getCompanyById(id));
        return result;
    }

    /**
     * get entity by name.
     *
     * @param name the request
     * @return the response
     */
    @GetMapping("getCompanyByName")
    public EndpointResult getCompanyByName(@RequestParam("name") String name) {
        log.info("TestController getCompanyByName:");
        EndpointResult result = new EndpointResult();
        result.addData(sampleService.getCompanyByName(name));
        return result;
    }
}
