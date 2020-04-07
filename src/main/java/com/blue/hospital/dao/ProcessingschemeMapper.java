package com.blue.hospital.dao;

import com.blue.hospital.entity.Processingscheme;
import com.blue.hospital.entity.ProcessingschemeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProcessingschemeMapper {
    long countByExample(ProcessingschemeExample example);

    int deleteByExample(ProcessingschemeExample example);

    int deleteByPrimaryKey(Integer processingschemeno);

    int insert(Processingscheme record);

    int insertSelective(Processingscheme record);

    List<Processingscheme> selectByExample(ProcessingschemeExample example);

    Processingscheme selectByPrimaryKey(Integer processingschemeno);

    int updateByExampleSelective(@Param("record") Processingscheme record, @Param("example") ProcessingschemeExample example);

    int updateByExample(@Param("record") Processingscheme record, @Param("example") ProcessingschemeExample example);

    int updateByPrimaryKeySelective(Processingscheme record);

    int updateByPrimaryKey(Processingscheme record);
}