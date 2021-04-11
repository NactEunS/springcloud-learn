package com.sanji.service;

import com.sanji.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by joe on 17-3-15.
 */
@FeignClient("cloud-simple-service")
public interface UserFeginService {
  @RequestMapping(value = "/user", method = RequestMethod.GET)
  List<User> readUserInfo();

}
