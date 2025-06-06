package com.khai.dao;

import com.khai.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployee() {

        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> emp = query.getResultList();
        return emp;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = (Employee) session.get(Employee.class, id);
        return employee;
    }
}
