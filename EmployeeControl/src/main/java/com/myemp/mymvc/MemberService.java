package com.myemp.mymvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service
public class MemberService {
	
	@Autowired
	IMemberRepository memberDAO=new MemberRepository();
	
	 
	public void insertEmp(EmpVO emp) {
		memberDAO.insertEmp(emp);
		
	}	
	
	public void deleteEmp(int empNum)
	{
		memberDAO.deleteEmp(empNum);
	}
	
	public EmpVO getEmp(int empNum)
	{
		return memberDAO.getEmp(empNum);
	}
	
	public List<EmpVO> getAllEmp()
	{
		return memberDAO.getAllEmp();
	}
	
	
	
	
}
