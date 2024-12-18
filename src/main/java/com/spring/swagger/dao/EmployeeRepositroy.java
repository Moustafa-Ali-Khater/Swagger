package com.spring.swagger.dao;

import com.spring.swagger.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositroy extends JpaRepository<Employee, Long> {
}
