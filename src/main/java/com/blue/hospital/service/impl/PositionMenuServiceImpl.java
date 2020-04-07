package com.blue.hospital.service.impl;

import com.blue.hospital.dao.PositionmenuMapper;
import com.blue.hospital.entity.Positionmenu;
import com.blue.hospital.entity.PositionmenuExample;
import com.blue.hospital.service.PositionMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PositionMenuServiceImpl implements PositionMenuService {

	@Autowired
	PositionmenuMapper positionmenuMapper;

	@Override
	public List<Integer> selectMenuByPoId(Integer poid) {

		return positionmenuMapper.selctMenuByPoId(poid);
	}

	@Override
	public int saveAuthority(Integer poId, Integer[] menuIds) {
		// 影响的行数
		Integer count = 0;

		// 清空数据
		PositionmenuExample example = new PositionmenuExample();
		PositionmenuExample.Criteria criteria = example.createCriteria();
		criteria.andPostidEqualTo(poId);
		positionmenuMapper.deleteByExample(example);

		// 保存
		for (Integer menuId : menuIds) {
			Positionmenu pm = new Positionmenu();
			pm.setMenuid(menuId);
			pm.setPostid(poId);
			count += positionmenuMapper.insertSelective(pm);
		}

		return count;
	}

}
