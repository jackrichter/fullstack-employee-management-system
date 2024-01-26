package net.javaguides.ems.controller;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee() {

        return null;
    }

    public ResponseEntity<EmployeeDto> getEmployeeById() {

        return null;
    }

    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {

        return null;
    }

    public ResponseEntity<EmployeeDto> updateEmployee() {

        return null;
    }

    public ResponseEntity<String> deleteEmployee() {

        return null;
    }
}
