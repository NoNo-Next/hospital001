package com.blue.hospital.service;


import com.blue.hospital.entity.Position;
import com.blue.hospital.entity.PositionExample;

import java.util.List;

public interface PositionService {

	/**
	 * 查询职位的全部信息
	 * @param example
	 * @return
	 */
	List<Position> queryAllPosition(PositionExample example);

	/**
	 * position表
	 * @return
	 */
	List<Position> queryPositionDept();

	Integer updatePositionById(Position p);

	//添加职位
	int addPosition(Position p);

	//查询某条id的职位信息
	Position queryPositionById(Integer poId);

	//根据id修改当前职位信息
	Integer updateById(Position position);

	Integer delPositonById(Position p);
}
