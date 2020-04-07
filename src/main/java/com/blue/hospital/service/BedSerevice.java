package com.blue.hospital.service;


import com.blue.hospital.entity.Bed;
import com.blue.hospital.entity.BedExample;

import java.util.List;

public interface BedSerevice {
	
	/**
	 * 下拉列表查询
	 * @return
	 */
	List<Bed> queryAllBed(BedExample example);
	
	/**
	 * 全查询
	 * @return
	 */
	List<Bed> queryBedUserIcu();
	
	/**
	 * 根据主键查询
	 * @param bid
	 * @return
	 */
	Bed selectByPrimaryKey(Integer bid);
	
	/**
	 * 修改
	 * @param bed
	 * @return
	 */
	Integer updateBedById(Bed bed);
	
	/**
	 * 添加
	 * @param bed
	 * @return
	 */
	Integer insertBed(Bed bed);

}
