/**
 * 版权所有：大千连和（深圳）网络科技有限公司 2018
 * 描述: 生产者提供的服务类hello
 * <p>
 * 注意：无
 * <p>
 * 修改记录：
 * 修改人    日期         修改内容
 * ------------------------------------------------------------
 * yuantli  18/05/26  -  创建
 */

package com.alicehz.dqcloud.msprovider.service;

import org.springframework.stereotype.Component;


@Component
public class SayHi implements Hi
{
    public String hello(String name)
    {
        return "hello " + name + " !";
    }
}
