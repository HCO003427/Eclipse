package com.chetan.learningspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chetan.learningspring.model.Employee;
@RepositoryRestResource(collectionResourceRel="Employees", path="Employees")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
