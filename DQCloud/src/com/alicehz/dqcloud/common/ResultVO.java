/**
 * 版权所有：大千连和（深圳）网络科技有限公司 2018
 * 描述: 公共组件类ResultVOA
 * <p>
 * 注意：
 * <p>
 * 修改记录：
 * 修改人      日期       修改内容
 * ------------------------------------------------------------
 * yuantli   2018/05/28 -  创建
 */

package com.alicehz.dqcloud.common;

import lombok.Data;


@Data
public class ResultVO<T>
{

    private Integer code;

    private String msg;

    private T data;

}
