package com.example._2023practice.common.java8;
/**
 * 
 * @author KK JavaTutorials
 *Model class
 */
public class Student {

	private Integer id;
	private String name;

	public Student(int i, String vishal) {
		this.id=i;
		this.name=vishal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String             getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [Student id=" + id + ", Student name=" + name + "]";
	}
}