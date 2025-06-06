package com.khai.service;

import com.khai.dao.EmployeeDAO;
import com.khai.dao.EmployeeDAOImpl;
import com.khai.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAOImpl employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        employeeDAO.deleteEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }
}
