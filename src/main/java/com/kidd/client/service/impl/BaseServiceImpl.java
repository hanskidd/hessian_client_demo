package com.kidd.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kidd.api.domain.User;
import com.kidd.api.service.UserService;
import com.kidd.client.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService{

	
	/**
	 * 这里是声明了api项目的user业务层
	 */
	@Autowired
	private UserService userService;
	
	
	@Override
	public User getUserInfoByIdFromRemote(int id) {
		return userService.getUserById(id);
	}

}
