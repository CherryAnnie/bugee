package com.ast.mall.bugee.controller;

import com.ast.mall.bugee.BugeeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private BugeeProperties bugeeProperties;

    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    //@GetMapping(value = "/hello/{id}")
    public String say() {
       // return bugeeProperties.getCupSize();
        return "index";
    }
}
