package com.khai.service;

import com.khai.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Employee getEmployeeById(int id);
}
