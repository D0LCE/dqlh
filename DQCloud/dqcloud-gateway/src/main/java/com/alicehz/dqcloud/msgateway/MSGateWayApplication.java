/**
  * 版权所有：大千连和（深圳）网络科技有限公司 2018
  *   描述: 微服务网关（Zuul)启动文件
  *
  *   注意：无
  *
  *   修改记录：
  *   修改人    日期         修改内容
  *   ------------------------------------------------------------
  *   yuantli  18/05/26  -  创建
  *
  */

package com.alicehz.dqcloud.msgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class MSGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MSGateWayApplication.class, args);
    }
}
