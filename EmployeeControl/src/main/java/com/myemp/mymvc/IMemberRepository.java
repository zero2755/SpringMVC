package com.myemp.mymvc;

import java.util.ArrayList;
import java.util.List;

public interface IMemberRepository {
	
	public List<EmpVO> getAllEmp();
	
	public EmpVO getEmp(int empNum);
	
	public void insertEmp(EmpVO emp);
	
	public void deleteEmp(int empNum);
	
	
	
}
