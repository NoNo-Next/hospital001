package com.blue.hospital.dao;

import com.blue.hospital.entity.User;
import com.blue.hospital.entity.UserExample;
import com.blue.hospital.pojo.UserAndPartment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

	User findUserByName(String userName);

	long countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer userid);

	//返回当前插入的对象
	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer userid);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	/**
	 * 根据用户id查询该用户所有信息(department)
	 */
	List<UserAndPartment> selectByUserId(Integer id);


	/**
	 * 关联查询(User Position Department)
	 * 
	 * @return
	 */
	List<User> queryAll(User user);

    User findUserById(Integer userid);
}