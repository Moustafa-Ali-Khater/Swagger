package com.spring.swagger.controller;

import com.spring.swagger.dao.EmployeeRepositroy;
import com.spring.swagger.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
//@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Employee", description = "Employee Controller Layer")
public class EmployeeController {

    private EmployeeRepositroy employeeRepositroy;

    @Autowired
    public EmployeeController(EmployeeRepositroy employeeRepositroy) {
        this.employeeRepositroy = employeeRepositroy;
    }

    @GetMapping("/getEmployees")
    @Operation(description = "Display Employee", summary = "Display Employee",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK")
            })
    public ResponseEntity<Employee> getEmployees(@RequestParam Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(
                employeeRepositroy.findById(id).get()
        );
    }

    @PostMapping("/save")
//    @Operation(description = "Save Employee", summary = "Save Employee",
//                responses = {
//                    @ApiResponse(responseCode = "201", description = "Created")
//                })
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                employeeRepositroy.save(employee)
        );
    }

    @PutMapping("/update")
//    @Operation(description = "Update Employee", summary = "Update Employee",
//            responses = {
//                    @ApiResponse(responseCode = "201", description = "Updated")
//            })
    public void update(@RequestBody Employee employee) {
         employeeRepositroy.save(employee);
    }

    @DeleteMapping("/delete")
//    @Operation(description = "Delete Employee", summary = "Delete Employee",
//            responses = {
//                    @ApiResponse(responseCode = "200", description = "Deleted")
//            })
    public void delete(Long id) {
        employeeRepositroy.deleteById(id);
    }
}
