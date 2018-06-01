package com.ttyy.notify.controller;

import com.ttyy.notify.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotfiyController {

    @PostMapping("/notify")
    @ResponseBody
    public Result getResult(){
        Result result = new Result();
        result.setMsg("success");
        result.setStatus("0");
        return result;
    }
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
