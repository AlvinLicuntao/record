package com.alvin.record.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alvin.record.dao.UserMapper;
import com.alvin.record.model.User;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}
