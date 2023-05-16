package com.api.user.service;

import java.util.List;
import com.api.user.pojo.UserInfo;

public interface UserInfoService {
  /**
   * 新增一条数据
   *
   * @param userInfo 数据
   */
  void add(UserInfo userInfo);

  /**
   * 删除一条数据
   *
   * @param id 被删除数据的id
   */
  void delete(Integer id);

  /**
   * 更新一条数据
   *
   * @param userInfo 修改的数据
   */
  void update(UserInfo userInfo);

  /**
   * 通过id查询一条数据
   *
   * @param id 查询的id
   */
  UserInfo queryById(Integer id);

  /**
   * 查询全部数据
   *
   * @return
   */
  List<UserInfo> queryAll();
}
