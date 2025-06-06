package com.khai;

import com.khai.dao.EmployeeDAO;
import com.khai.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class MyController {

    @Autowired
    private EmployeeDAO empDAO;

    @RequestMapping("/")
    public String showAllEmployee(Model model)
    {
        List<Employee> allEmployees = empDAO.getAllEmployee();
        model.addAttribute(" ", allEmployees);
        return "show-all-employees";
    }

}
