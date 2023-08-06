package com.employeedirectory.Service;

import com.employeedirectory.Entity.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    Employee findEmployeeById(String employeeId);

    void deleteEmployee(String employeeId);
}
