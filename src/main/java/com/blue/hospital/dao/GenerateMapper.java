package com.blue.hospital.dao;


import com.blue.hospital.entity.Generate;
import com.blue.hospital.entity.GenerateExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GenerateMapper {
    long countByExample(GenerateExample example);

    int deleteByExample(GenerateExample example);

    int deleteByPrimaryKey(Integer receipt);

    int insert(Generate record);

    int insertSelective(Generate record);

    List<Generate> selectByExample(GenerateExample example);

    Generate selectByPrimaryKey(Integer receipt);

    int updateByExampleSelective(@Param("record") Generate record, @Param("example") GenerateExample example);

    int updateByExample(@Param("record") Generate record, @Param("example") GenerateExample example);

    int updateByPrimaryKeySelective(Generate record);

    int updateByPrimaryKey(Generate record);
}