package com.alicehz.springcloudprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * <p>
 * <p>
 * Modefied  Date
 * yuantli   2018-05-21 -  Creation
 */

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider2Application.class, args);
    }
}
