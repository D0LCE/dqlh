package com.alicehz.springcloudconsumer.hytrix;

import com.alicehz.springcloudconsumer.UserFeignClient;
import com.alicehz.springcloudconsumer.entity.User;
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
public class UserFeignClientHystrix implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User u = new User();
        u.setId(34L);
        u.setUsername("DQLH");
        u.setName("Alice");
        u.setAge(34);
        u.setBalance(121424);

        return u;
    }
}
