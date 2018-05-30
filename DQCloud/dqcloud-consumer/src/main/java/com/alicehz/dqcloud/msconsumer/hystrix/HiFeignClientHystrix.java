/**
  * 版权所有：大千连和（深圳）网络科技有限公司 2018
  *   描述: Hi服务断路器
  *
  *   注意：无
  *
  *   修改记录：
  *   修改人    日期         修改内容
  *   ------------------------------------------------------------
  *   yuantli  18/05/26  -  创建
  *
  */

package com.alicehz.dqcloud.msconsumer.hystrix;

import com.alicehz.dqcloud.msconsumer.HiFeignClient;
import org.springframework.stereotype.Component;

@Component
public class HiFeignClientHystrix implements HiFeignClient {
    @Override
    public String hello(String name) {
        return "Failed !";
    }
}
