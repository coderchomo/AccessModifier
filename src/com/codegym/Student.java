package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college="ALADIN";

    public Student(int r, String n) {
        rollno=r;
        name=n;
    }
    static void change(){
        college="CODEGYM";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}

