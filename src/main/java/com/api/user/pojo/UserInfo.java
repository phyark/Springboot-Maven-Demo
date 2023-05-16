package com.api.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 使用@Data 自动生成所需要的get、set
@Data
// 使用@AllArgsConstructor自动生成有参构造
@AllArgsConstructor
// 使用@NoArgsConstructor自动生成无参构造
@NoArgsConstructor

public class UserInfo {
  private Integer id;
  private String username;
  private String password;
  private String authority;
}
