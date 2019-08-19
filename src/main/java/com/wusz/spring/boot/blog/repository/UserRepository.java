/**
 * 
 */
package com.wusz.spring.boot.blog.repository;

import java.util.List;

import com.wusz.spring.boot.blog.domain.User;

/**
 * @author Administrator
 *
 */
public interface UserRepository {
	
	/*
	 * 创建或修改用户
	 * 
	 * */
	User saveOrUpdateUser(User user);
	
	/*
	 * 删除用户
	 * 
	 * */
	void deleteUser(Long id);
	
	/*
	 * 根据id查询用户
	 * 
	 * */
	User getUserById(Long id);
	
	/*
	 * 获取用户列表
	 * 
	 * */
	List<User> listUser();

}
