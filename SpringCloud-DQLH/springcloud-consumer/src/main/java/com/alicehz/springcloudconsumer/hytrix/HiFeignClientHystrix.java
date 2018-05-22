package com.alicehz.springcloudconsumer.hytrix;

import com.alicehz.springcloudconsumer.HiFeignClient;
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
public class HiFeignClientHystrix implements HiFeignClient{
    @Override
    public String hello(String name) {
        return "Failed !";
    }
}
