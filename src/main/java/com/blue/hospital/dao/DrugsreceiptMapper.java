package com.blue.hospital.dao;

import com.blue.hospital.entity.Drugsreceipt;
import com.blue.hospital.entity.DrugsreceiptExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DrugsreceiptMapper {
    long countByExample(DrugsreceiptExample example);

    int deleteByExample(DrugsreceiptExample example);

    int deleteByPrimaryKey(Integer receiptid);

    int insert(Drugsreceipt record);

    int insertSelective(Drugsreceipt record);

    List<Drugsreceipt> selectByExample(DrugsreceiptExample example);

    Drugsreceipt selectByPrimaryKey(Integer receiptid);

    int updateByExampleSelective(@Param("record") Drugsreceipt record, @Param("example") DrugsreceiptExample example);

    int updateByExample(@Param("record") Drugsreceipt record, @Param("example") DrugsreceiptExample example);

    int updateByPrimaryKeySelective(Drugsreceipt record);

    int updateByPrimaryKey(Drugsreceipt record);
}