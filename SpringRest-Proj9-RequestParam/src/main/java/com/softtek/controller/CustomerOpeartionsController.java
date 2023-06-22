package com.softtek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOpeartionsController {
	@GetMapping("/report")
	public String reportData(@RequestParam("cno") Integer no, @RequestParam String cname) {
		return no + cname;
	}

	@GetMapping("/reportPathVariableDemo/{cno}/{cname}/{caddrs}")
    public String reportData1( @PathVariable("cno")  String  cno,@PathVariable("cname") String cname,
    		@PathVariable(required = false) int msg)
    {
    	System.out.println(msg);
    	return cno+cname;		
    }
	@GetMapping("/report/no/name")
    public String fetchdata1(@PathVariable(name="name",required = false)String cname,
    		@PathVariable(required = false) Integer no)
   {
	   System.out.println("CustomerOpeartionsController.fetchdata1()");
    			return cname+no;
   }
	@GetMapping("/report/no/{name}")
    public String fetchdata2(@PathVariable(name="name",required = false)String cname,
    		@PathVariable(required = false) Integer no)
   {
	   System.out.println("CustomerOpeartionsController.fetchdata1()");
    			return cname+no;
   }
	@GetMapping("/report/{no}/{name}")
    public String fetchdata3(@PathVariable(name="name",required = false)String cname,
    		@PathVariable(required = false) Integer no)
   {
	   System.out.println("CustomerOpeartionsController.fetchdata1()");
    			return cname+no;
   }
	@GetMapping("/report/{no}/name")
    public String fetchdata4(@PathVariable(name="name",required = false)String cname,
    		@PathVariable(required = false) Integer no)
   {
	   System.out.println("CustomerOpeartionsController.fetchdata1()");
    			return cname+no;
   }
}
