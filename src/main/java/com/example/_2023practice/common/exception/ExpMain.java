package com.example._2023practice.common.exception;

import java.io.IOException;

public class ExpMain {

    public static void main(String[] args) throws IOException {

        Parent p=new Child();

        p.getName();
        p.getName1();

        p.getName1Runtime();

    }
}
