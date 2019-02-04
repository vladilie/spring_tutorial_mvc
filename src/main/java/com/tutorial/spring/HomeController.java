package com.tutorial.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/showForm/v2/")
    public String showFormV2() {
        return "helloworld-form-v2";
    }

    @RequestMapping("/processForm/v2")
    public String processForm(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName");
        model.addAttribute("message", "How do you do " + studentName);
        return "helloworld-v2";
    }


    @RequestMapping("/showForm/v3/")
    public String showFormV3() {
        return "helloworld-form-v3";
    }

    @RequestMapping("/processForm/v3")
    public String processFormv2(@RequestParam("studentName") String studentName, Model model) {
        model.addAttribute("message", "Hey my friend " + studentName);
        return "helloworld-v3";
    }
}