package com.vm.college;

public class College {

	private String name;
	private Department dept;
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "College [name=" + name + ", dept=" + dept.noofDept + "]";
	}
	
	
	
}
