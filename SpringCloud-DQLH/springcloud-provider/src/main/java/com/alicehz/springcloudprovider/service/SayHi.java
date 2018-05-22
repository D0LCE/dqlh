package com.alicehz.springcloudprovider.service;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * <p>
 * <p>
 * Modefied  Date
 * yuantli   2018-05-21 -  Creation
 */

@Component
public class SayHi implements Hi{
    public String hello(String name) {
        return "Hello " + name  + " !";
    }
}
