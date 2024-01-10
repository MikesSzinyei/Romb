package com.example;

import java.util.InputMismatchException;

public class Romb {
    public double calcArea(double side, double a, double b) {
        if(side  <= 0 || a <= 0) {
            throw new InputMismatchException("Hiba!");
        }
        return Math.pow(side, 2)*(Math.sin(a*(Math.PI/180)));
    }

    public double calcCircumference(double side) {
        return side*4;
    }

}
