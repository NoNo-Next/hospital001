package com.blue.hospital.service;


import com.blue.hospital.entity.Menu;

import java.util.List;

public interface MenuService {

	/**
	 * 根据父级id查询对应菜单集合
	 * @param parentId
	 * @return
	 */
	public List<Menu> queryByParentId(Integer parentId);

}
