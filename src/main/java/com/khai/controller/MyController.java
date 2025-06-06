package com.khai.controller;

import com.khai.dao.EmployeeDAO;
import com.khai.dao.EmployeeDAOImpl;
import com.khai.entity.Employee;
import com.khai.service.EmployeeService;
import com.khai.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class MyController {

    @Autowired
    private EmployeeService employeeDAO;

    @RequestMapping("/")
    public String showAllEmployee(Model model)
    {
        List<Employee> allEmployees = employeeDAO.getAllEmployee();
        model.addAttribute("employees", allEmployees);
        return "show-all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model)
    {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
         return "employee-form";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee)
    {
        employeeDAO.saveEmployee(employee);
        return "redirect:/employees/";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("empID") int id, Model model)
    {
        Employee employee = employeeDAO.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-form";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empID") int id, Model model)
    {
        Employee employee = employeeDAO.getEmployeeById(id);
        employeeDAO.deleteEmployee(employee);
        return "redirect:/employees/";
    }

}
