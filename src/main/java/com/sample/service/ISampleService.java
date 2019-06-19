package com.sample.service;

import com.sample.model.TestRequestModel;
import com.sample.model.entity.Company;
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
    TestModel saveTest(TestRequestModel request);

    /**
     * get test by id.
     *
     * @param id the api request log
     * @return
     */
    TestModel getTestById(Long id);

    /**
     * get test by name.
     *
     * @param name the api request log
     * @return
     */
    TestModel getTestByName(String name);

    /**
     * get company by name.
     *
     * @param name the api request log
     * @return
     */
    Company getCompanyByName(String name);

    /**
     * save Company.
     *
     * @param request the api request log
     * @return
     */
    Company saveCompany(Company request);

    /**
     * get Company by id.
     *
     * @param id the api request log
     * @return
     */
    Company getCompanyById(Long id);


}
