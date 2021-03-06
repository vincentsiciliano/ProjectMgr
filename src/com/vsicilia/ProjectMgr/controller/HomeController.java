package com.vsicilia.ProjectMgr.controller;

import com.vsicilia.ProjectMgr.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.inject.Inject;

@Controller
public class HomeController {

    private TestService testService;

    @Inject
    public HomeController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/")
    public String home(){

        return "home";
    }
}
