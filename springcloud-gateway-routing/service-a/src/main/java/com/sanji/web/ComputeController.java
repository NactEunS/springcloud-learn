package com.sanji.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by joe on 17-3-16.
 */
@RestController
public class ComputeController {

  private final Logger logger = Logger.getLogger(getClass());

  @Autowired
  private DiscoveryClient client;

  @RequestMapping(value = "/add" ,method = RequestMethod.GET)
  public String add(@RequestParam(defaultValue = "2") Integer a, @RequestParam(defaultValue = "4") Integer b) {
    ServiceInstance instance = client.getLocalServiceInstance();
    Integer r = a + b;
    logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
    return "From Service-A, Result is " + r;
  }


}
