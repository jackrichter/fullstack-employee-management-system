package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

    public static Employee matToUpdatedEmployee(Employee foundEmployee, EmployeeDto updatedEmployee) {
        foundEmployee.setId(updatedEmployee.getId());
        foundEmployee.setFirstName(updatedEmployee.getFirstName());
        foundEmployee.setLastName(updatedEmployee.getLastName());
        foundEmployee.setEmail(updatedEmployee.getEmail());

        return foundEmployee;
    }
}
