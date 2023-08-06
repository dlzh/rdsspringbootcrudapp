package com.employeedirectory.Service.impl;

import com.employeedirectory.Entity.Employee;
import com.employeedirectory.Repository.EmployeeRepository;
import com.employeedirectory.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee updateEmployee = employeeRepository.findByEmployeeId(employee.getEmployeeId());
        updateEmployee.setEmployeeId(employee.getEmployeeId());
        updateEmployee.setDepartment(employee.getDepartment());
        updateEmployee.setAddress(employee.getAddress());
        updateEmployee.setPhoneNumber(employee.getPhoneNumber());
        employeeRepository.save(updateEmployee);
        return updateEmployee;
    }

    @Override
    public Employee findEmployeeById(String employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    @Override
    public void deleteEmployee(String employeeId) {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        employeeRepository.delete(employee);
    }
}
