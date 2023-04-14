package com.example._2023practice.Designpattern.CREATIONAL.Builder;

//here if at class level @builder is done it wil not work it need at constuctor level
//@Getter
public class Child extends Parent {
    private final String childName;
    private final int childAge;

    public Child(String parentName, int parentAge, String childName, int childAge) {
        super(parentName, parentAge);
        this.childName = childName;
        this.childAge = childAge;
    }

    //@lombok.Builder
    /*public Child(String parentName, int parentAge, String childName, int childAge) {
        //super(parentName, parentAge);
        this.childName = childName;
        this.childAge = childAge;
    }*/
}
