package com.blue.hospital.service;

import com.blue.hospital.entity.User;
import com.blue.hospital.pojo.UserAndPartment;

import java.util.List;

public interface UserService {

	/**
	 * 查询所有员工
	 */
	List<User> selectAll(User user);

	/**
	 * 登录
	 */
	User login(String userName, String password);

	/**
	 * 根据用户的id查询到该用户信息(department)
	 */
	List<UserAndPartment> getUserAndPart(Integer id);

	/**
	 * 根据id查询
	 */
	User getUserById(Integer id);

	/**
	 * 添加User
	 */
	int addUser(User user);

	/**
	 * 根据用户id修改用户信息
	 */
	Integer updateUserById(User user);

	User findUserByName(String userName);

	Integer delUserById(User user);
}
