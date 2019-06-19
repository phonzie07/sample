package com.sample.repository;

import com.sample.model.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long > {
    Company findByName(String name);
}
