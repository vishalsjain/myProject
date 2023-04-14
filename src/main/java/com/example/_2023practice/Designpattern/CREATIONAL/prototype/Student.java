package com.example._2023practice.Designpattern.CREATIONAL.prototype;
/**
 * 
 * @author KK JavaTutorials
 *Model class
 */
public class Student {

	private Integer id;
	private String name;
	
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
	
	@Override
	public String toString() {
		return "Student [Student id=" + id + ", Student name=" + name + "]";
	}
}