/**
 * 版权所有：大千连和（深圳）网络科技有限公司 2018
 * 描述: 网关过滤器类
 * <p>
 * 注意：无
 * <p>
 * 修改记录：
 * 修改人    日期         修改内容
 * ------------------------------------------------------------
 * yuantli  18/05/26  -  创建
 */

package com.alicehz.dqcloud.msgateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


public class MyFilter extends ZuulFilter
{
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType()
    {
        return "pre";
    }

    @Override
    public int filterOrder()
    {
        return 0;
    }

    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    @Override
    public Object run()
    {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(
            String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken == null)
        {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try
            {
                ctx.getResponse().getWriter().write("token is empty");
            }
            catch (Exception e) {}

            return null;
        }
        log.info("ok");
        return null;
    }
}
