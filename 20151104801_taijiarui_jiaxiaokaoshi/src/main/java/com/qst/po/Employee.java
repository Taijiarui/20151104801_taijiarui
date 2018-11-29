package com.qst.po;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Employee {

	private Integer empid;
	
	@NotBlank(message="用户名不能为空")
	private String name;
	
	private Integer gender;
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date birthday;
	
	private String mobile;
	private String email;
	private String position;
	private String note;
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
				+ ", mobile=" + mobile + ", email=" + email + ", position=" + position + ", note=" + note + "]";
	}
	
	
}
