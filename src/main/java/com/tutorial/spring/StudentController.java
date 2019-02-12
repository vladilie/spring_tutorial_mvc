package com.tutorial.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Properties;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private Properties countries;

    @Autowired
    private Properties languages;

    @Autowired
    private Properties operatingSystems;

    @RequestMapping("showForm")
    public String showForm(@ModelAttribute("student") Student student, Model model) {
        return returnToView("student-form", model, student);
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("student") Student student, Model model) {
        student.setCountries(countries);
        student.setLanguages(languages);
        student.setOperatingSystems(operatingSystems);
        return returnToView("student", model, student);
    }

    private String returnToView(String viewName, Model model, Student student) {
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("operatingSystems", operatingSystems);
        return viewName;
    }


}
