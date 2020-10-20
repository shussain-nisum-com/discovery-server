package com.thepracticaldeveloper.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

  public static void main(String[] args) {
    System.out.println('hello world');
    SpringApplication.run(EurekaServerApplication.class, args);
  }
}
