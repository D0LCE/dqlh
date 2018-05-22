package com.alicehz.springcloudprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alicehz.springcloudprovider.entity.User;
import com.alicehz.springcloudprovider.repository.UserRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * <p>
 * <p>
 * Modefied  Date
 * yuantli   2018-05-16 -  Creation
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        return userRepository.findById(id).orElse(null);
    }

}
