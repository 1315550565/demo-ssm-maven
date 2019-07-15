package com.cetc15.dao;

import javax.annotation.Resource;

import com.cetc15.entity.UserT;
@Resource(name="userTMapping")
public interface UserTMapping {
	 
	public UserT getUserById(Integer userId);
	 
}
