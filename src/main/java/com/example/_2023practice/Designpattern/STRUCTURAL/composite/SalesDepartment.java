package com.example._2023practice.Designpattern.STRUCTURAL.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


public class SalesDepartment implements Department {

    private Integer id;

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

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    public void printDepartmentName() {

        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}