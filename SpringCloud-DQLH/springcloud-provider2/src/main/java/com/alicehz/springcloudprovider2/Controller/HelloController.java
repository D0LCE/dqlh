package com.alicehz.springcloudprovider2.Controller;

import com.alicehz.springcloudprovider2.service.Hi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * <p>
 * <p>
 * Modefied  Date
 * yuantli   2018-05-16 -  Creation
 */

@RestController
public class HelloController {

    @Autowired
    private Hi hi;

    @GetMapping("/hi/{user}")
    public String findById(@PathVariable String user) {

        return hi.hello(user);
    }

}
