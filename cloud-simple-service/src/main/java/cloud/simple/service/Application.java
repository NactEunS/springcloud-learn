package cloud.simple.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by owen on 2016/10/20.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
