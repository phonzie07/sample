package com.sample.service.impl;

import com.generic.utils.MapperUtil;
import com.sample.model.TestRequestModel;
import com.sample.model.entity.Company;
import com.sample.model.entity.TestModel;
import com.sample.repository.CompanyRepository;
import com.sample.repository.TestModelRepository;
import com.sample.service.ISampleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


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
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public String test(TestRequestModel request) {
        String result = "db config: " + test + " || request: " + MapperUtil.objectToJson(request);
        return result;
    }

    @Override
    public TestModel saveTest(TestRequestModel request) {
        TestModel saveModel = new TestModel();
        saveModel.setName(request.getName());
        TestModel result = testModelRepository.save(saveModel);
        return result;
    }

    @Override
    public TestModel getTestById(Long id) {
        TestModel tm = testModelRepository.findById(id).get();
        return tm;
    }

    @Override
    public TestModel getTestByName(String name) {
        TestModel tm = testModelRepository.findByName(name);
        return tm;
    }

    @Override
    public Company getCompanyByName(String name) {
        Company company = companyRepository.findByName(name);
        return company;
    }

    @Override
    public Company saveCompany(Company request) {
        Company result = companyRepository.save(request);
        return result;
    }

    @Override
    public Company getCompanyById(Long id) {
        Company company = companyRepository.findById(id).get();
        return company;
    }

    @Override
    public List<Company> getCompanyList() {
        List<Company> companyList = companyRepository.findAll();
        return companyList;
    }

    @Override
    public Company saveCompanyDescById(String desc, Long companyId) {
        Company company = companyRepository.findById(companyId).get();
        log.info("old Company desc: "+ company.getDescription());
        company.setDescription(desc);
        log.info("new Company desc: "+ company.getDescription());
        company = companyRepository.save(company);
        log.info("new Company: "+ MapperUtil.objectToJson(company));

        return company;
    }

    @Override
    public Company saveCompanyDescByName(String desc, String name) {
        Company company = companyRepository.findByName(name);
        log.info("old Company desc: "+ company.getDescription());
        company.setDescription(desc);
        log.info("new Company desc: "+ company.getDescription());
        company = companyRepository.save(company);
        log.info("new Company: "+ MapperUtil.objectToJson(company));

        return company;
    }
}
