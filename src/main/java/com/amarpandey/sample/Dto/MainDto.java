package com.amarpandey.sample.Dto;

public class MainDto {

	private String name;
	private String age;

	public MainDto() {
		super();
	}

	public MainDto(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
