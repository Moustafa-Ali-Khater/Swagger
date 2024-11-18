package com.spring.swagger.controller;

import com.spring.swagger.dao.EmployeeRepositroy;
import com.spring.swagger.model.Employee;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@Tag(name = "Player Controller", description = "Player Controller Layer")
@RestController
@RequestMapping("api")
public class PlayerController {

    @GetMapping("/players")
    public String getPlayers() {
        return "Welcome Players";
    }

    @GetMapping("/cotchs")
//    @Tag(name = "Employee Controller")
    @Hidden
    public String getCoachs() {
        return "Welcome Coachs";
    }
}
