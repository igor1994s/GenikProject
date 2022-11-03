package com.example.genikmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @GetMapping("/")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("homePage");
        return modelAndView;
    }

    @GetMapping("/delivery-and-payment")
    public ModelAndView shippingAdndPayment(ModelAndView modelAndView){
        modelAndView.setViewName("homePage/deliveryAndPayment");
        return modelAndView;
    }

    @GetMapping("/manufacturing-process")
    public ModelAndView manufacturingProcess(ModelAndView modelAndView){
        modelAndView.setViewName("homePage/manufacturingProcess");
        return modelAndView;
    }

    @GetMapping("/interesting-facts")
    public ModelAndView interestingFacts(ModelAndView modelAndView){
        modelAndView.setViewName("homePage/interestingFacts");
        return modelAndView;
    }

    @GetMapping("/contacts")
    public ModelAndView contacts(ModelAndView modelAndView){
        modelAndView.setViewName("homePage/contacts");
        return modelAndView;
    }


}
