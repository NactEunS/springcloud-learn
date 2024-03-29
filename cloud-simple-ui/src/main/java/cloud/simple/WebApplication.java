package cloud.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.context.annotation.Scope;

//import feign.Feign;
//import feign.Logger;
//import feign.Request;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
//@EnableFeignClients
public class WebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignBuilder() {
//        return Feign.builder();
//    }
//
//    @Bean
//    public Logger.Level feignLogger() {
//        return Logger.Level.FULL;
//    }
//
//    private static final int FIVE_SECONDS = 5000;
//
//    @Bean
//    public Request.Options options() {
//        return new Request.Options(FIVE_SECONDS, FIVE_SECONDS);
//    }

}
