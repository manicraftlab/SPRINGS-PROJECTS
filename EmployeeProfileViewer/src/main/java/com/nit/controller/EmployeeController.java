package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.model.Employee;

@Controller
public class EmployeeController {

    @RequestMapping(value="/click", method=RequestMethod.GET)
    public String showForm(Model model) {

        model.addAttribute("employee", new Employee());

        return "employee";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String saveEmployee(@ModelAttribute Employee employee,
                               Model model) {

        model.addAttribute("employee", employee);

        return "success";
    }
}