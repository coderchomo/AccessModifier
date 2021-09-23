package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Mazda 3","SkyActive 3");
        System.out.println(Car.numberOfCars);
        Car car2=new Car("Mazda6","SkyActive 6");
        System.out.println(Car.numberOfCars);
    }


}
