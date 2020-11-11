package com.tsubulko.task_9;

/*
9.	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

public class Circles {
    private double radius;

    public double getLength(){
        return 2*Math.PI*radius;
    }

    public double getSquare(){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circles(double radius) {
        this.radius = radius;
    }
}
