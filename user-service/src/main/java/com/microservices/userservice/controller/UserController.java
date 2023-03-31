package com.microservices.userservice.controller;

import com.microservices.userservice.VO.ResponseTemplateVO;
import com.microservices.userservice.entity.User;
import com.microservices.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users", produces = {"application/json"})
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("saving the user details");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Getting the User Details with Department");
        return  userService.getUserWithDepartment(userId);
    }
}
