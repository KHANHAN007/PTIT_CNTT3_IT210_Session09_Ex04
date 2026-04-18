package com.session05.ex04.controller;

import com.session05.ex04.model.Seller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/register")
@SessionAttributes("seller")
public class RegisterController {
    @ModelAttribute("seller")
    public Seller createSeller() {
        return new Seller();
    }

    @GetMapping("/step1")
    public String step1() {
        return "step1";
    }

    @GetMapping("/step2")
    public String step2() {
        return "step2";
    }

    @GetMapping("/step3")
    public String step3(@ModelAttribute("seller") Seller seller, Model model) {
        model.addAttribute("seller", seller);
        return "step3";
    }

    @PostMapping("/step1")
    public String handleStep1(@ModelAttribute("seller") Seller seller) {
        return "redirect:/register/step2";
    }

    @PostMapping("/step2")
    public String handleStep2(@ModelAttribute("seller") Seller seller) {
        return "redirect:/register/step3";
    }

    @PostMapping("/finish")
    public String finish(@ModelAttribute("seller") Seller seller, Model model, SessionStatus sessionStatus) {
        System.out.println("SAVE DB:" + seller.getFullName() + ", " + seller.getEmail() + ", " + seller.getShopName() + ", " + seller.getAddress());
        sessionStatus.setComplete();
        return "redirect:/register/success";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }
}
