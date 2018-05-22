package com.alicehz.springcloudconsumer;

import com.alicehz.springcloudconsumer.entity.User;
import com.alicehz.springcloudconsumer.hytrix.UserFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * <p>
 * <p>
 * Modefied  Date
 * yuantli   2018-05-19 -  Creation
 */

@FeignClient(value = "springcloud-provider", fallback = UserFeignClientHystrix.class) //设置熔断
public interface UserFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    public User findById(@PathVariable("id") Long id);
}
