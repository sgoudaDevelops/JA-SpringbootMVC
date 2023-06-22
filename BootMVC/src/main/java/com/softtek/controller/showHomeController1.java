package com.softtek.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showHomeController1 {
	
	@GetMapping("/report")	
	public String reporting(Map<String,Object> map)
	{
		map.put("favDishes",new String[] {"chickenMasala","Egg Makhanwala","Holige"});
		map.put("DogBreed", List.of("German Sheoford","Lab"));
		map.put("Passwords",Map.of("insta",34534,"Fb",2345) );
		return "hello";
	}
	
	@RequestMapping("/")
	public String Showhome() {
		//return "welcome";
		return "home";
	}
//	@RequestMapping("/")	
//	public String reporting1(Map<String,Object> map)
//	{
//		map.put("favDishes",new String[] {"chickenMasala","Egg Makhanwala","Holige"});
//		map.put("DogBreed", List.of("German Sheoford","Lab"));
//		map.put("Passwords",Map.of("insta",34534,"Fb",2345) );
//		return "hello";
//		
//	}
	@RequestMapping("/home")
	public String Showhome1() {
		return "welcome";
	}
	
	@RequestMapping("/process")
	public String processMap(Map<String,Object> map){
		System.out.println("showHomeController.processMap():: shared memory"+ map.get(getClass()));
		// add the  model attributes to shared memory
		map.put("attr1","val1");
		map.put("one", LocalDate.now());
		// lvn 
		return "show_view";
	}
	@RequestMapping("/processModel") // here lvn is request path
	public Model processMap()
	{
		System.out.println("showHomeController.processModel1()");
		Model m= new BindingAwareModelMap();// mannually created shared memory
		m.addAttribute("attr1","hiii");
		m.addAttribute("two",LocalDate.now().getDayOfMonth());
		return m;
	}
	@RequestMapping("/process3")
	public String processMap3(Map<String,Object> map){
		System.out.println("showHomeController.processMap3()");
		// add the  model attributes to shared memory
		map.put("attr1","val1");
		map.put("one", LocalDate.now());
		// lvn 
		//return "forward:processModel";
		return "redirect:processModel";
	}
	@RequestMapping("/process4")
	public String processMap4(Map<String,Object> map){
		System.out.println("showHomeController.processMap4()");
		// add the  model attributes to shared memory
		map.put("attr1","val1");
		map.put("one", LocalDate.now());
		// lvn 
		return "redirect:process3";
	}


}
