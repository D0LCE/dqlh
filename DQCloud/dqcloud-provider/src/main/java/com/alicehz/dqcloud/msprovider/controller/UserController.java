/**
 * 版权所有：大千连和（深圳）网络科技有限公司 2018
 * 描述: 生产者服务控制层用例2
 * <p>
 * 注意：
 * <p>
 * 修改记录：
 * 修改人    日期         修改内容
 * ------------------------------------------------------------
 * yuantli  18/05/26  -  创建
 */

package com.alicehz.dqcloud.msprovider.controller;

import com.alicehz.dqcloud.msprovider.entity.User;
import com.alicehz.dqcloud.msprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController
{

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id)
    {

        return userRepository.findById(id).orElse(null);
    }

}
