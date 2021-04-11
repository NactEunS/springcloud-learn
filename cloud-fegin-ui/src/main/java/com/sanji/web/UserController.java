package com.sanji.web;

import com.sanji.model.User;
import com.sanji.service.UserFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import cloud.simple.service.UserServiceProvider.FeignUserService;

@RestController
public class UserController {
  @Autowired
  UserFeginService userFeginService;

  @RequestMapping(value = "/users",method = RequestMethod.GET)
  public List<User> findUsers() {

    return userFeginService.readUserInfo();

  }

}
