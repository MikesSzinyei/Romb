package com.example;

public class Romb {
    public double calcArea(double side, double a, double b) {
        return Math.pow(side, 2)*(Math.sin(a*(Math.PI/180)));
    }

    public double calcCircumference(double side) {
        return side*4;
    }

}
