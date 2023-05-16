package com.api.user.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.user.mapper.UserInfoMapper;
import com.api.user.pojo.UserInfo;
import com.api.user.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

  @Autowired
  private UserInfoMapper userInfoMapper;

  @Override
  public void add(UserInfo userInfo) {
    userInfoMapper.add(userInfo);
  }

  @Override
  public void delete(Integer id) {
    userInfoMapper.delete(id);
  }

  @Override
  public void update(UserInfo userInfo) {
    userInfoMapper.update(userInfo);
  }

  @Override
  public UserInfo queryById(Integer id) {
    return userInfoMapper.queryById(id);
  }

  @Override
  public List<UserInfo> queryAll() {
    return userInfoMapper.queryAll();
  }
}
