package com.blue.hospital.dao;


import com.blue.hospital.entity.Medicalrecord;
import com.blue.hospital.entity.MedicalrecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MedicalrecordMapper {
    long countByExample(MedicalrecordExample example);

    int deleteByExample(MedicalrecordExample example);

    int deleteByPrimaryKey(Integer medicalrecordid);

    int insert(Medicalrecord record);

    int insertSelective(Medicalrecord record);

    List<Medicalrecord> selectByExample(MedicalrecordExample example);

    Medicalrecord selectByPrimaryKey(Integer medicalrecordid);

    int updateByExampleSelective(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByExample(@Param("record") Medicalrecord record, @Param("example") MedicalrecordExample example);

    int updateByPrimaryKeySelective(Medicalrecord record);

    int updateByPrimaryKey(Medicalrecord record);
    
    
    
    /**
     * 全查询
     * @return
     */
    List<Medicalrecord> queryAll();
    
    Integer deleteMedicalRecordById(Integer medicalrecordid);
}