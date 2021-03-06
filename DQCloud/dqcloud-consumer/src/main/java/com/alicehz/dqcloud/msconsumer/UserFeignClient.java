/**
 * 版权所有：大千连和（深圳）网络科技有限公司 2018
 * 描述: 使用Feign（声明式伪HTTP客户端）消费服务，添加断路器支持
 * <p>
 * 注意：
 * <p>
 * 修改记录：
 * 修改人    日期         修改内容
 * ------------------------------------------------------------
 * yuantli  18/05/26  -  创建
 */

package com.alicehz.dqcloud.msconsumer;

import com.alicehz.dqcloud.msconsumer.entity.User;
import com.alicehz.dqcloud.msconsumer.hystrix.UserFeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "dqcloud-provider", fallback = UserFeignClientHystrix.class) //设置熔断
public interface UserFeignClient
{
    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    public User findById(@PathVariable("id") Long id);
}
