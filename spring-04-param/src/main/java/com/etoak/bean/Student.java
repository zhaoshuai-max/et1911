package com.etoak.bean;

public class Student {
	private Integer id;
	private String name;
	private Integer ageInteger;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAgeInteger() {
		return ageInteger;
	}
	public void setAgeInteger(Integer ageInteger) {
		this.ageInteger = ageInteger;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ageInteger=" + ageInteger + "]";
	}
}
