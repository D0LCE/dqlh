/**
  * 版权所有：大千连和（深圳）网络科技有限公司 2018
  *   描述: 生产者2微服务启动文件
  *
  *   注意：
  *
  *   修改记录：
  *   修改人    日期         修改内容
  *   ------------------------------------------------------------
  *   yuantli  18/05/26  -  创建
  *
  */

package com.alicehz.dqcloud.msprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MSProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(MSProvider2Application.class, args);
    }
}
