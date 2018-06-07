/**
 * 版权所有：大千连和（深圳）网络科技有限公司 2018
 * 描述: 微服务注册中心
 * <p>
 * 注意：
 * <p>
 * 修改记录：
 * 修改人    日期         修改内容
 * ------------------------------------------------------------
 * yuantli  18/05/26  -  创建
 */

package com.alicehz.dqcloud.msservicecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class MSServiceCenterApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MSServiceCenterApplication.class, args);
    }
}
