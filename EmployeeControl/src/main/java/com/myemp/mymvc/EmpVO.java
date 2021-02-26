package com.myemp.mymvc;

public class EmpVO {
	
	
	String name;
	int empNum;
	int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	 public String toString() {
	 return "EmpVO [emp_Name=" + name + "emp_Salary:"+ salary+" emp_Num :"+empNum+"\n";
	 
	 }

	
	
}
