package com.myemp.mymvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	
	@Autowired
	MemberService memberService;
					 
	@RequestMapping(value="/getEmp")
	public String getEmp(int empNum,Model model)
	{	
		EmpVO emp=memberService.getEmp(empNum);
		model.addAttribute("emp", emp);
		
		
		return "getEmp";
	}
	
	@RequestMapping(value="/getAllEmp")
	public String getAllEmp(Model model)
	{	
		
		
		model.addAttribute("empList", memberService.getAllEmp());
		
		return "getAllEmp";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	 public String insertEmp() {
		System.out.println("insert 겟");
	 	return "insertEmp";
	 }
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertEmp(EmpVO emp) {
		memberService.insertEmp(emp);
		System.out.println("insert포스트");
		return "redirect:/getAllEmp";
	 }
	
	@RequestMapping(value="/delete")
	public String deleteEmp(int empNum) {
		memberService.deleteEmp(empNum);
		System.out.println("삭제완료");
		return "redirect:/getAllEmp";
	 }
	
	 @RequestMapping(value="/update", method=RequestMethod.GET)
	 public String updateEmp() {
	
		 System.out.println("업뎃겟");
	   return "updateEmp";
	 }
	
	@RequestMapping(value="/updateGo", method=RequestMethod.POST)
	public String updateEmp(EmpVO emp) {
	  memberService.updateEmp(emp);
	  System.out.println("업뎃POST");
	 return "redirect:/getAllEmp";
	 }
	
				
				 
		
	
	
}
