/**
  * 版权所有：大千连和（深圳）网络科技有限公司 2018
  *   描述: 用户entity类
  *
  *   注意：1. 使用lombok.Data，无需定义setter和getter
  *        2. 使用JPA
  *
  *   修改记录：
  *   修改人    日期         修改内容
  *   ------------------------------------------------------------
  *   yuantli  18/05/26  -  创建
  *
  */

package com.alicehz.dqcloud.msprovider.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private float balance;

}
