package com.autoSchoolPartThreeAndSix.figure;

public class Square extends Figures{

    private String name;
    private double area;
    private double b;
    private double a;

    public Square(String name, double a, double b) {
        this.name = name;

    }
    public double area(){
        return a * b;
    }

}
