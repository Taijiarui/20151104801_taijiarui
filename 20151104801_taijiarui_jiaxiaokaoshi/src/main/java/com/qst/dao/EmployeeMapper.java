package com.qst.dao;

import org.springframework.stereotype.Repository;

import com.qst.po.Employee;

@Repository
public interface EmployeeMapper {

	public Employee selectEmployeeById(int id);

	public Employee selectEmployeeByName(String name);
}
