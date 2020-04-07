package com.blue.hospital.dao;

import com.blue.hospital.entity.Pharmacydepot;
import com.blue.hospital.entity.PharmacydepotExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PharmacydepotMapper {
    long countByExample(PharmacydepotExample example);

    int deleteByExample(PharmacydepotExample example);

    int deleteByPrimaryKey(Integer pharmacydepotid);

    int insert(Pharmacydepot record);

    int insertSelective(Pharmacydepot record);

    List<Pharmacydepot> selectByExample(PharmacydepotExample example);

    Pharmacydepot selectByPrimaryKey(Integer pharmacydepotid);

    int updateByExampleSelective(@Param("record") Pharmacydepot record, @Param("example") PharmacydepotExample example);

    int updateByExample(@Param("record") Pharmacydepot record, @Param("example") PharmacydepotExample example);

    int updateByPrimaryKeySelective(Pharmacydepot record);

    int updateByPrimaryKey(Pharmacydepot record);
}