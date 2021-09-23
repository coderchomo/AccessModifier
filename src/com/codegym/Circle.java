package com.codegym;

public class Circle {
    final double PI=3.1415;
    private double radius=1.0;
    private String color="red";
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
}
