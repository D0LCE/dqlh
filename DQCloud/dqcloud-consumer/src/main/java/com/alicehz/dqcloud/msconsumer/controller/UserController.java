/**
  * 版权所有：大千连和（深圳）网络科技有限公司 2018
  *   描述: 用户消费服务Controller
  *
  *   注意：无
  *
  *   修改记录：
  *   修改人    日期         修改内容
  *   ------------------------------------------------------------
  *   yuantli  18/05/26  -  创建
  *
  */
package com.alicehz.dqcloud.msconsumer.controller;

import com.alicehz.dqcloud.common.ResultVO;
import com.alicehz.dqcloud.msconsumer.UserFeignClient;
import com.alicehz.dqcloud.msconsumer.HiFeignClient;
import com.alicehz.dqcloud.msconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;


@RestController
public class UserController {

//    非Feign方式Restful服务调用
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

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return this.hiFeignClient.hello(name);
    }

    @RequestMapping(value = "/hi/getvo", method = RequestMethod.GET)
    public ResultVO getVO() {
        return new ResultVO();
    }

}
