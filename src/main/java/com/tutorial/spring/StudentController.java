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
    private StudentView studentView;

    @RequestMapping("showForm")
    public String showForm(Model model) {
        return returnToView("student-form", model, new Student());
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("student") Student student, Model model) {
        return returnToView("student", model, student);
    }

    private String returnToView(String viewName, Model model, Student student) {
        studentView.setStudent(student);
        model.addAttribute("student", studentView);
        model.addAttribute("countries", studentView.getCountries());
        model.addAttribute("languages", studentView.getLanguages());
model.addAttribute("operatingSystems", studentView.getOperatingSystems());
        return viewName;
    }


}
