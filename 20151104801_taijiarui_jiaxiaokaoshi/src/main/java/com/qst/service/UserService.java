package com.qst.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qst.dao.EmployeeMapper;
import com.qst.po.Employee;

@Service
public class UserService {

	@Resource
	EmployeeMapper employeeMapper;
	
	public boolean login(Employee emp) {
		Employee empSelect=employeeMapper.selectEmployeeByName(emp.getName());
		if(empSelect==null)
			return false;
		return true;
	}

	public EmployeeMapper getEmployeeMapper() {
		return employeeMapper;
	}

	public void setEmployeeMapper(EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}
	
	

}
