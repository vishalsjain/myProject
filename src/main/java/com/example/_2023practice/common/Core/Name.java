package com.example._2023practice.common.Core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

class Name {

    private final String first, last;

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    private Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    /*@Override
    public int hashCode() {
        return 1;
    }*/

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Name)) {
            return false;
        }
        Name n = (Name) o;
        return n.first.equals(first) && n.last.equals(last);
    }

    // what will be the output?

    //here since hashcode is not overiden it is always returning new value when new keyword is used.
    //hence when contains is called since hashcode is not same it do not call equals method
    public static void main(String[] args) {
        Set<Name> names = new HashSet<>();
        names.add(new Name("Tom", "Smith"));
        System.out.println(new Name("Tom", "Smith").hashCode());
        System.out.println(new Name("Tom", "Smith").hashCode());

        System.out.println(
                names.contains(new Name("Tom", "Smith"))
        );
names.add(new Name("Tom", "Smith"));
names.stream().forEach(name -> System.out.println(name.toString()));


try {
            voidMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }/* catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    method(null);
    Object o=null;
method(o);

    print();


        String s1=new String("hello");
        String s2="hello";
        String s3=s1.intern();
        String s4=new String("hello");
        String s5="hello";
        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s2==s5);//true



    }


    static void print() {
        String m = "Hello";
        System.out.println(m);
        bar(m);
        System.out.println(m);
    }

    static void bar(String m) {
        m += " World!";
    }


    public static void method(Object o) {
        System.out.println("Object method");
    }
    /*public static void method(String s) {
        System.out.println("String method");
    }*/
    public static void method(Integer s) {
        System.out.println("Integer method");
    }

    private static void voidMethod() throws IOException, FileNotFoundException {
    }
}