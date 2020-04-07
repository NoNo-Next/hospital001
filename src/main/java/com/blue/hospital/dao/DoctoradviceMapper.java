package com.blue.hospital.dao;


import com.blue.hospital.entity.Doctoradvice;
import com.blue.hospital.entity.DoctoradviceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctoradviceMapper {
    long countByExample(DoctoradviceExample example);

    int deleteByExample(DoctoradviceExample example);

    int deleteByPrimaryKey(Integer doctoradviceid);

    int insert(Doctoradvice record);

    int insertSelective(Doctoradvice record);

    List<Doctoradvice> selectByExample(DoctoradviceExample example);

    Doctoradvice selectByPrimaryKey(Integer doctoradviceid);

    int updateByExampleSelective(@Param("record") Doctoradvice record, @Param("example") DoctoradviceExample example);

    int updateByExample(@Param("record") Doctoradvice record, @Param("example") DoctoradviceExample example);

    int updateByPrimaryKeySelective(Doctoradvice record);

    int updateByPrimaryKey(Doctoradvice record);
}