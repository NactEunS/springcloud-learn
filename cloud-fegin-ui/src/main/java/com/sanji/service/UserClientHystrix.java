package com.sanji.service;

import com.sanji.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joe on 17-3-16.
 */
@Component
public class UserClientHystrix implements UserFeginService{
  @Override
  public List<User> readUserInfo() {
    List<User> users = new ArrayList<User>();
    User user = new User();
    user.setUsername("服务出错");
    users.add(user);
    return users;
  }
}
