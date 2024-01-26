package net.javaguides.ems.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        return null;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return null;
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long employeeId) {

    }
}
