package com.tsubulko.task_3;

public class Circle {
    private double radius;

    public double getSquareOfInnerSquare(){
        return (radius*2)*(radius*2)/2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
