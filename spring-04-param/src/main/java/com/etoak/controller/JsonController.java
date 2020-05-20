package com.etoak.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etoak.bean.Student;
import com.etoak.bean.User;
import com.etoak.vo.ResultVo;

@RestController //@Controller +@ResponseBody
@RequestMapping("/json")
public class JsonController {
	@PostMapping("/jsonToMap")
	public Object mapToJson(@RequestBody Map<String,Object> jsonToMap) {
		System.out.println(jsonToMap);
	
		return "{\"msg\",\"success\"}";
	}
	
	@PostMapping("/jsonToList")
	public Map<String, Object> jsonToList(@RequestBody List<User> userList){
		userList.forEach(x -> System.out.println(x));
		Map<String, Object> resultMap=new HashMap<String, Object>();
		resultMap.put("code",200);
		resultMap.put("msg", "success");
		return resultMap;
	}
		@PostMapping("/jsonToBean")
		public ResultVo jsonToBean(@RequestBody Student student) {
			System.out.println(student);
			return new ResultVo(200,"success");
		}
}
