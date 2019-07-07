package com.vsicilia.ProjectMgr.controller;

import com.vsicilia.ProjectMgr.Dto.User;
import com.vsicilia.ProjectMgr.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
public class UserController {

    private UserService userService;

    @Inject
    public UserController(UserService userService){
        this.userService = userService;
    }

    @ResponseBody
    @GetMapping("/testInsert")
    public String testInsert(){

        User user = new User("test_user");
        user.setPassword("1234");

        userService.registerUser(user);

        return "it probably should have worked";
    }


}
