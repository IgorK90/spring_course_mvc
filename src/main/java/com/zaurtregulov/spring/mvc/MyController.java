package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetail()
    {
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails()
//    {
//        return "show-emp-details-view";
//    }


//    @RequestMapping("/showDetails")
//    public String showDetails(HttpServletRequest request, Model model)
//    {
//        String empName = request.getParameter("employeeName"); //employeeName берется из ссылки генерируемой в ask-emp-details-view
//        empName = "Mr. "+empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", " - udemy instructor");
//
//
//        return "show-emp-details-view";
//    }
@RequestMapping("/showDetails")

public String showDetails(@RequestParam("employeeName") String empName , Model model)
{
    empName = "Mr. "+empName + "!";
    model.addAttribute("nameAttribute", empName);

    return "show-emp-details-view";
}
}

