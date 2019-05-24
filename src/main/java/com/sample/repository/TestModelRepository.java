package com.sample.repository;

import com.sample.model.entity.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface TestModel repository.
 */
public interface TestModelRepository extends JpaRepository<TestModel, Long > {
    TestModel findByName(String name);
}
