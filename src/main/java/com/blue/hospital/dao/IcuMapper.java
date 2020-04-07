package com.blue.hospital.dao;


import com.blue.hospital.entity.Icu;
import com.blue.hospital.entity.IcuExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IcuMapper {
    long countByExample(IcuExample example);

    int deleteByExample(IcuExample example);

    int deleteByPrimaryKey(Integer icuid);

    int insert(Icu record);

    int insertSelective(Icu record);

    List<Icu> selectByExample(IcuExample example);

    Icu selectByPrimaryKey(Integer icuid);

    int updateByExampleSelective(@Param("record") Icu record, @Param("example") IcuExample example);

    int updateByExample(@Param("record") Icu record, @Param("example") IcuExample example);

    int updateByPrimaryKeySelective(Icu record);

    int updateByPrimaryKey(Icu record);

    //查询icu表
	List<Icu> selectIcuInfo();
}