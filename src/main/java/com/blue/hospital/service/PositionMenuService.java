package com.blue.hospital.service;

import java.util.List;

public interface PositionMenuService {

	/**
	 * 根据职位id查询对应菜单id的集合
	 * @param poid
	 * @return
	 */
	List<Integer> selectMenuByPoId(Integer poid);

	//保存权限
	int saveAuthority(Integer poId, Integer[] menuIds);
 
}
