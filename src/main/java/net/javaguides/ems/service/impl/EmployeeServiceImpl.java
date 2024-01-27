package net.javaguides.ems.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;
import net.javaguides.ems.exception.ResourceNotFoundException;
import net.javaguides.ems.mapper.EmployeeMapper;
import net.javaguides.ems.repository.EmployeeRepository;
import net.javaguides.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = repository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = repository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("No employee found with this id: " + employeeId));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = repository.findAll();

        return employees.stream()
                .map(empl -> EmployeeMapper.mapToEmployeeDto(empl))
                .toList();
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployeeDto) {
        Employee existingEmployee = repository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("No employee found with this id: " + employeeId));

        Employee returnedUpdated = repository.save(EmployeeMapper.matToUpdatedEmployee(existingEmployee, updatedEmployeeDto));

        return EmployeeMapper.mapToEmployeeDto(returnedUpdated);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee existingEmployee = repository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("No employee found with this id: " + employeeId));

        repository.deleteById(employeeId);
    }
}
