package com.softtek.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.model.Student;

@Controller
public class StudentOperationsController {
	@GetMapping("/")
	public String showHomePage()
	{
		// return LVN 
		return"welcome";
	}
	@GetMapping("/register")
	public String showStudentFormPage(@ModelAttribute("stud") Student st)
	{
		return "Student";
	}
	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map,@ModelAttribute("stud") Student st)
	{
		String grade=null;
		if(st.getSavg()>75)
			grade="distinction";
		else if(st.getSavg()>60)
			grade="FirstClass";
		else if(st.getSavg()>35)
			grade="pass";
		else grade="fail";
		map.put("result", grade);
		// return lvn
		return "showResult";
	}
	//paramDemo?sno=101&savg=65&saddrs=tallur&sname=shiva
	@GetMapping("/paramDemo")
	public String showStudentFormPage1(Map<String, Object> map,
			@RequestParam("sno")String sno, @RequestParam("sname") String sname,
			@RequestParam("saddrs")String saddrs,
			@RequestParam("savg")String savg)
	{
		 map.put("sno", sno);
		 map.put("savg", savg);
		 map.put("sname", sname);
		 map.put("saddrs", saddrs);
		return "studentParam";
		
	}

}
