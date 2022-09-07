package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetail(Model model)
    {
//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Ivanov");
//        emp.setSalary(500);
        model.addAttribute("employee", new Employee());
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

//public String showDetails(@RequestParam("employeeName") String empName , Model model)
//{
//    empName = "Mr. "+empName + "!";
//    model.addAttribute("nameAttribute", empName);
//
//    return "show-emp-details-view";
//}
public String showDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult)
{
//    String name= emp.getName();
//    emp.setName("Mr. "+name);
//
//    String surname = emp.getSurname();
//    emp.setSurname(surname+ " !");
//
//    int salary = emp.getSalary();
//    emp.setSalary(salary*10);
    System.out.println("surname length = " + emp.getSurname().length());
    if (bindingResult.hasErrors()) {
        return "ask-emp-details-view";
    }
    else {
        return "show-emp-details-view";
    }
}
}

