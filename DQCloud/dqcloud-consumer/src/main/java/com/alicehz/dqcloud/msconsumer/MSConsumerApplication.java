/**
 * 版权所有：大千连和（深圳）网络科技有限公司 2018
 * 描述: 微服务消费者启动文件
 * <p>
 * 注意：启用断路器 Hystrix
 * <p>
 * 修改记录：
 * 修改人    日期         修改内容
 * ------------------------------------------------------------
 * yuantli  18/05/26  -  创建
 */

package com.alicehz.dqcloud.msconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//import org.springframework.cloud.httpclient.loadbalancer.LoadBalanced;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.httpclient.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class MSConsumerApplication
{

//  启用HTTPClient
//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

    public static void main(String[] args)
    {
        SpringApplication.run(MSConsumerApplication.class, args);
    }

}
