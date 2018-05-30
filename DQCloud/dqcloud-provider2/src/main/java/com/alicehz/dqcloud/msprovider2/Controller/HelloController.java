/**
  * 版权所有：大千连和（深圳）网络科技有限公司 2018
  *   描述: 生产者控制器
  *
  *   注意：
  *
  *   修改记录：
  *   修改人    日期         修改内容
  *   ------------------------------------------------------------
  *   yuantli  18/05/26  -  创建
  *
  */

package com.alicehz.dqcloud.msprovider2.Controller;

import com.alicehz.dqcloud.msprovider2.service.Hi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Hi hi;

    @GetMapping("/hi/{user}")
    public String findById(@PathVariable String user) {

        return hi.hello(user);
    }

}
