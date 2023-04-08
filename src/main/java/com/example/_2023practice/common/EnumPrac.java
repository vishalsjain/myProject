package com.example._2023practice.common;

public enum EnumPrac {

    SUCESS("a","b","c"),FAIL("d","e","f");

    private String a;
    private String b;
    private String c;


    EnumPrac(String a, String b, String c) {
    this.a=a;
    this.b=b;
    this.c=c;
    }

    /**
     * get field
     *
     * @return a
     */
    public String getA() {
        return this.a;
    }

    /**
     * set field
     *
     * @param a
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * get field
     *
     * @return b
     */
    public String getB() {
        return this.b;
    }

    /**
     * set field
     *
     * @param b
     */
    public void setB(String b) {
        this.b = b;
    }

    /**
     * get field
     *
     * @return c
     */
    public String getC() {
        return this.c;
    }

    @Override
    public String toString() {
        return "EnumPrac{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    /**
     * set field
     *
     * @param c
     */
    public void setC(String c) {
        this.c = c;
    }
}
