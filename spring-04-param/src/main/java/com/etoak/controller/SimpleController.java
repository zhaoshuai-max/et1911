package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/simple")
public class SimpleController {
	@RequestMapping("/servlet")
	public String servlet(HttpServletRequest request) {
		String name=request.getParameter("name");
		if(org.springframework.util.StringUtils.isEmpty("name")) {
			
			name = "world";
		}
		request.setAttribute("result", "hello "+name);
		return "param";
	}
	
	@RequestMapping(value="/simple",method = {RequestMethod.GET})
	public ModelAndView simple(
		//value="a" 前端id=a;
			@RequestParam(required = false,defaultValue = "1")	int id,
			String name) {
		System.out.println("id param-"+id);
		System.out.println("name param-"+name);
		
		ModelAndView mView= new ModelAndView();
		mView.addObject("result","ModelAndView传值");
		mView.setViewName("param");
		return mView;
	}
	
}
