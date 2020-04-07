package com.blue.hospital.dao;


import com.blue.hospital.entity.Inpatient;
import com.blue.hospital.entity.InpatientExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InpatientMapper {
    long countByExample(InpatientExample example);

    int deleteByExample(InpatientExample example);

    int deleteByPrimaryKey(Integer hospitalizationid);

    int insert(Inpatient record);

    int insertSelective(Inpatient record);

    List<Inpatient> selectByExample(InpatientExample example);

    Inpatient selectByPrimaryKey(Integer hospitalizationid);

    int updateByExampleSelective(@Param("record") Inpatient record, @Param("example") InpatientExample example);

    int updateByExample(@Param("record") Inpatient record, @Param("example") InpatientExample example);

    int updateByPrimaryKeySelective(Inpatient record);

    int updateByPrimaryKey(Inpatient record);
    
    List<Inpatient> queryInpatientDepartment();
}