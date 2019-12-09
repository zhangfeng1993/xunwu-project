package com.zf.web.controller.user;

import com.zf.entity.User;
import com.zf.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/*")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

}
