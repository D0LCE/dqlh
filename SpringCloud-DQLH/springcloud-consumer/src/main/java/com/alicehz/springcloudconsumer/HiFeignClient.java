package com.alicehz.springcloudconsumer;

import com.alicehz.springcloudconsumer.hytrix.HiFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *
 * Modefied  Date
 * yuantli   2018-05-21 -  Creation
 */

@FeignClient(value = "springcloud-provider", fallback = HiFeignClientHystrix.class) //设置熔断
public interface HiFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/hi/{name}")
    public String hello(@PathVariable("name") String name);
}
