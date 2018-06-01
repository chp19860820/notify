package com.ttyy.notify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PayController {

    @RequestMapping(path = "/payFront", method = RequestMethod.GET)
    public String payFront(){
        return "view/payment";
    }
}
