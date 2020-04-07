package com.blue.hospital.service.impl;

import com.blue.hospital.dao.PositionMapper;
import com.blue.hospital.entity.Position;
import com.blue.hospital.entity.PositionExample;
import com.blue.hospital.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PositionServiceImpl implements PositionService {

	@Autowired
	PositionMapper positionMapper;

	/**
	 * 这是position表的单表全查询(下拉列表)
	 */
	@Override
	public List<Position> queryAllPosition(PositionExample example) {

		return positionMapper.selectByExample(example);
	}

	@Override
	public List<Position> queryPositionDept() {
		List<Position> list = positionMapper.queryPositionDept();
		return list;
	}

	@Override
	public Integer updatePositionById(Position p) {

		return positionMapper.updateByPrimaryKeySelective(p);
	}

	@Override
	public int addPosition(Position p) {

		return positionMapper.insert(p);
	}

	@Override
	public Position queryPositionById(Integer poId) {

		return positionMapper.selectByPrimaryKey(poId);
	}

	@Override
	public Integer delPositonById(Position p) {
		return positionMapper.deleteByPrimaryKey(p.getPostnumber());
	}

	@Override
	public Integer updateById(Position position) {

		int i = positionMapper.updateByPrimaryKeySelective(position);

		return i;
	}

}
