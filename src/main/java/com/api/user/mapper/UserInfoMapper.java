package com.api.user.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.api.user.pojo.UserInfo;

@Repository
@Mapper
public interface UserInfoMapper {

  /**
   * 新增一条数据
   *
   * @param userinfo 数据
   */
  void add(UserInfo userInfo);

  /**
   * 删除一条数据
   *
   * @param id 被删除的数据id
   */
  void delete(Integer id);

  /**
   * 更新一条数据
   *
   * @param userInfo
   */
  void update(UserInfo userInfo);

  /**
   * 通过id查询一条数据
   *
   * @param id
   * @return
   */
  UserInfo queryById(Integer id);

  /**
   * 查询全部数据
   *
   * @return
   */
  List<UserInfo> queryAll();
}
