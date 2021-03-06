package com.sample.service.impl;

import com.generic.utils.MapperUtil;
import com.sample.model.TestRequestModel;
import com.sample.model.entity.TestModel;
import com.sample.repository.TestModelRepository;
import com.sample.service.ISampleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * The type Log service.
 */
@Log4j2
@Service
public class SampleService implements ISampleService {

    @Value("${spring.datasource.driverClassName}")
    private String test;

    @Autowired
    private TestModelRepository testModelRepository;

    @Override
    public String test(TestRequestModel request) {
        String result = "db config: " + test + " || request: " + MapperUtil.objectToJson(request);
        return result;
    }

    @Override
    public TestModel save(TestRequestModel request) {
        TestModel saveModel = new TestModel();
        saveModel.setName(request.getName());
        TestModel result = testModelRepository.save(saveModel);
        return result;
    }

    @Override
    public TestModel get(Long id) {
        TestModel tm = testModelRepository.findById(id).get();
        return tm;
    }

    @Override
    public TestModel getByName(String name) {
        TestModel tm = testModelRepository.findByName(name);
        return tm;
    }
}
