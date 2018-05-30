/**
  * 版权所有：大千连和（深圳）网络科技有限公司 2018
  *   描述: 用户服务断路器
  *
  *   注意：
  *
  *   修改记录：
  *   修改人    日期         修改内容
  *   ------------------------------------------------------------
  *   yuantli  18/05/26  -  创建
  *
  */

package com.alicehz.dqcloud.msconsumer.hystrix;

import com.alicehz.dqcloud.msconsumer.UserFeignClient;
import com.alicehz.dqcloud.msconsumer.entity.User;
import org.springframework.stereotype.Component;

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
