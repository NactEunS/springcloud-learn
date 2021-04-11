package com.sanji.web;

import com.sanji.model.User;
import com.sanji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by joe on 17-3-16.
 */
@RestController
public class UserRibbonController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/user",method = RequestMethod.GET)
  public List<User> findUsers(){

    return userService.findUsers();

  }
}
