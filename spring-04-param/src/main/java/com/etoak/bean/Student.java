package com.etoak.bean;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //无参构造
@AllArgsConstructor //顺序
public class Student {
	private Integer id;
	private String name;
	private Integer ageInteger;
	private List<String> hobbyList;
	
	private Map<String, Object> stuMap;
	
}
