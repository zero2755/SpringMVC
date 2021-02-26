package com.myemp.mymvc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
	
	
	 
	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config.xml");
				 MemberService memberService = context.getBean("memberService", MemberService.class);
				 
				 System.out.println("--사원입력---");
				 EmpVO emp1=new EmpVO();
				 
				 emp1.setEmpNum(1);
				 emp1.setName("철수");
				 emp1.setSalary(1000);
				 
				 EmpVO emp2=new EmpVO();
				 
				 emp2.setEmpNum(2);
				 emp2.setName("영희");
				 emp2.setSalary(2000);
				 
				 EmpVO emp3=new EmpVO();
				 
				 emp3.setEmpNum(3);
				 emp3.setName("수영");
				 emp3.setSalary(3000);
				 
				 System.out.println(emp3.toString());
				 
				 try {
					 memberService.insertEmp(emp1);
					 System.out.println("insert OK");
				 }
				 catch(Exception e) {
					 System.out.println(e.getMessage());
				 }
				 
				 try {
					 memberService.insertEmp(emp2);
					 System.out.println("insert OK");
				 }
				 catch(Exception e) {
					 System.out.println(e.getMessage());
				 }
				 
				 try {
					 memberService.insertEmp(emp3);
					 System.out.println("insert OK");
				 }
				 catch(Exception e) {
					 System.out.println(e.getMessage());
				 }
				 
				 System.out.println("---사번1 조회---");
				 
				 EmpVO search=memberService.getEmp(1);
				 search.toString();
				 
				 System.out.println("---사번2 삭제---");
				 
				 memberService.deleteEmp(2);
				 
				 System.out.println("---전체사원조회---");
		
				 System.out.println(memberService.getAllEmp());
				 
				 
				 System.out.println("---시스템종료---");
	}
	
}
