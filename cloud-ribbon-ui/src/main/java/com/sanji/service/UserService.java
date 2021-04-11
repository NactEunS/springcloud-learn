package com.sanji.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sanji.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joe on 17-3-16.
 */
@Service
public class UserService {
  @Autowired
  RestTemplate restTemplate;

  final String SERVICE_NAME = "cloud-simple-service";

  @HystrixCommand(fallbackMethod = "findServiceFallback")
  public List<User> findUsers(){

    return restTemplate.getForObject("http://" + SERVICE_NAME + "/user",List.class);

  }

  public List<User> findServiceFallback(){
    List<User> users = new ArrayList<>();
    User user = new User();
    user.setUsername("程序出错");
    users.add(user);
    return users;

  }
}
