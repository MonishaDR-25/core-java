package com.xworkz.task.controller;

import com.xworkz.task.dto.LoanDto;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LoanController {

    public LoanController(){
        System.out.println("Running Loan Controller");
    }

    @RequestMapping("/saveLoan")
    public String onSave(LoanDto loanDto, Model model){
        System.out.println("Created on save");
        System.out.println(loanDto);
        model.addAttribute("loanDto",loanDto);
        return "/LoanResult.jsp";

    }
}
