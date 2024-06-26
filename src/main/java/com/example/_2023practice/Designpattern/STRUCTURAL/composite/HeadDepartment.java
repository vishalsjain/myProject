package com.example._2023practice.Designpattern.STRUCTURAL.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private Integer id;
    private String name;

    public HeadDepartment(Integer id, String name, List<Department> childDepartments) {
        this.id = id;
        this.name = name;
        this.childDepartments = childDepartments;
    }

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

    public List<Department> getChildDepartments() {
        return childDepartments;
    }

    public void setChildDepartments(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName() {
        childDepartments.forEach(s->s.printDepartmentName());
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
