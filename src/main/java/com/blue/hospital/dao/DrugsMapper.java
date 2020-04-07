package com.blue.hospital.dao;


import com.blue.hospital.entity.Drugs;
import com.blue.hospital.entity.DrugsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DrugsMapper {
	long countByExample(DrugsExample example);

	int deleteByExample(DrugsExample example);

	int deleteByPrimaryKey(Integer drugsid);

	int insert(Drugs record);

	int insertSelective(Drugs record);

	List<Drugs> selectByExample(DrugsExample example);

	Drugs selectByPrimaryKey(Integer drugsid);

	int updateByExampleSelective(@Param("record") Drugs record, @Param("example") DrugsExample example);

	int updateByExample(@Param("record") Drugs record, @Param("example") DrugsExample example);

	int updateByPrimaryKeySelective(Drugs record);

	int updateByPrimaryKey(Drugs record);

	// 下面是自己添加的方法
	List<Drugs> getAll();

	Drugs getDrugByid(Integer drugsid);

	int updateDrugs(Drugs drugs);
}