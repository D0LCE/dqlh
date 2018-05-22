package com.alicehz.springcloudconsumer.controller;

import com.alicehz.springcloudconsumer.HiFeignClient;
import com.alicehz.springcloudconsumer.UserFeignClient;
import com.alicehz.springcloudconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * <p>
 * <p>
 * Modefied  Date
 * yuantli   2018-05-17 -  Creation
 */

@RestController
public class UserController {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @GetMapping(value = "/movie/{id}")
//    public User findById(@PathVariable Long id) {
//        return this.restTemplate.getForObject("http://springcloud-provider/user/" + id, User
//                .class);
//    }


    @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private HiFeignClient hiFeignClient;

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }

    @RequestMapping(value ="/hi/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return this.hiFeignClient.hello(name);
    }

}
