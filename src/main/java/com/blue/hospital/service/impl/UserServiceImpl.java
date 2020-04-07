package com.blue.hospital.service.impl;

import com.blue.hospital.dao.UserMapper;
import com.blue.hospital.entity.User;
import com.blue.hospital.entity.UserExample;
import com.blue.hospital.pojo.UserAndPartment;
import com.blue.hospital.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> selectAll(User user) {

		List<User> list = userMapper.queryAll(user);

		return list;
	}

	@Override
	public User login(String userName, String password) {

		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(userName);
		criteria.andUserpwdEqualTo(password);
		List<User> list = userMapper.selectByExample(example);

		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<UserAndPartment> getUserAndPart(Integer id) {

		List<UserAndPartment> list = userMapper.selectByUserId(id);

		return list;
	}

	@Override
	public int addUser(User user) {
		user.setState(0);
		String hashAlgorithmName = "MD5";//加密方式
		String password =DigestUtils.md5DigestAsHex(user.getUserpwd().getBytes());//密码原值e10adc3949ba59abbe56e057f20f883e
		String salt = UUID.randomUUID().toString();//盐值
		int times = 2;//加密1024次
		String encodedPassword = new SimpleHash(hashAlgorithmName,password,salt,times).toString();
		user.setSalt(salt);
		user.setUserpwd(encodedPassword);
		int j = userMapper.insert(user);
		return j;
	}

	@Override
	public User getUserById(Integer id) {
		return userMapper.findUserById(id);
	}


	@Override
	public Integer delUserById(User user) {
		return userMapper.deleteByPrimaryKey(user.getUserid());
	}

	public User findUserByName(String userName) {
		return userMapper.findUserByName(userName);
	}

	@Override
	public Integer updateUserById(User user) {
		 User user1 = userMapper.findUserById(user.getUserid());
//		如果传过来有密码更新，则需要加密
		if (user1 !=null && !user1.getUserpwd().equals(user.getUserpwd())){
			String hashAlgorithmName = "MD5";//加密方式
			String password =DigestUtils.md5DigestAsHex(user.getUserpwd().getBytes());//密码原值e10adc3949ba59abbe56e057f20f883e
			String salt = UUID.randomUUID().toString();//盐值
			int times = 2;//加密1024次
			String encodedPassword = new SimpleHash(hashAlgorithmName,password,salt,times).toString();
			user.setSalt(salt);
			user.setUserpwd(encodedPassword);
		}
		// 这里只对用户做出修改的信息做出更新，不修改的信息不更新
		return userMapper.updateByPrimaryKeySelective(user);
	}

}
