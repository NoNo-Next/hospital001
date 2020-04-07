package com.blue.hospital.service.impl;

import com.blue.hospital.dao.DepartmentMapper;
import com.blue.hospital.entity.Department;
import com.blue.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public List<Department> getDeparments() {
		List<Department> list = departmentMapper.selectDepartment();
		return list;
	}

	@Override
	public int addDepartment(Department department) {

		return departmentMapper.insert(department);
	}

	// 删除
	@Override
	public int deleteDepartment(Department d) {
		return departmentMapper.deleteByPrimaryKey(d.getDepartmentid());
	}

	@Override
	public Department selectDepartmentById(Integer departmentid) {

		return departmentMapper.selectByPrimaryKey(departmentid);
	}

	@Override
	public Integer updateDepartmentById(Department department) {

		return departmentMapper.updateByPrimaryKeySelective(department);
	}

}
