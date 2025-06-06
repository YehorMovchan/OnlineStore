package com.khai.dao;

import com.khai.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Employee getEmployeeById(int id);

}
