package com.sample.service;

import com.sample.model.TestRequestModel;
import com.sample.model.entity.TestModel;

/**
 * The interface Sample service.
 */
public interface ISampleService {

    /**
     * test config.
     *
     * @param request the api request log
     * @return
     */
    String test(TestRequestModel request);

    /**
     * save test.
     *
     * @param request the api request log
     * @return
     */
    TestModel save(TestRequestModel request);

    /**
     * get test by id.
     *
     * @param id the api request log
     * @return
     */
    TestModel get(Long id);

    /**
     * get test by name.
     *
     * @param name the api request log
     * @return
     */
    TestModel getByName(String name);

}
