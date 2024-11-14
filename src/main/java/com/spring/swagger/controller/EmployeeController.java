package com.spring.swagger.controller;

import com.spring.swagger.dao.EmployeeRepositroy;
import com.spring.swagger.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("emp")
public class EmployeeController {

    private EmployeeRepositroy employeeRepositroy;
    @Autowired

    public EmployeeController(EmployeeRepositroy employeeRepositroy) {
        this.employeeRepositroy = employeeRepositroy;
    }

    @PostMapping("/save")
    public void save(@RequestBody Employee employee) {
        employeeRepositroy.save(employee);
    }

    @GetMapping("/show")
    public Employee show(@RequestParam Long id) {
        return employeeRepositroy.findById(id).get();
    }

    @PutMapping("/update")
    public void update(@RequestBody Employee employee) {
         employeeRepositroy.save(employee);
    }

    @DeleteMapping("/delete")
    public void delete(Long id) {
        employeeRepositroy.deleteById(id);
    }
}
