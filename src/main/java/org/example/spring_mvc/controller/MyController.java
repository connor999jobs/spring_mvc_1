package org.example.spring_mvc.controller;



import org.example.spring_mvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetail(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-detail-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("employeeName");
//        empName = "Mr " + empName;
//        model.addAttribute("nameAttribute", empName);
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "ask-emp-detail-view";
        }
        else{  return "show-emp-details-view";}


    }
}
