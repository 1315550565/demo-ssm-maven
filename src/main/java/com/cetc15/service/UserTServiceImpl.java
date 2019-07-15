package com.cetc15.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cetc15.dao.UserTMapping;
import com.cetc15.entity.UserT;
import com.cetc15.service.impl.UserTService;
@Service(value="userTService")
@Transactional
public class UserTServiceImpl implements UserTService{
  
	@Resource(name="userTMapping")
	private UserTMapping userMapping;
	
	public UserT getUserById(Integer userId) {
		UserT userT = userMapping.getUserById(userId);
		return userT;
	}
}
