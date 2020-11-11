package com.tsubulko.task_7;

/*
7.	Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
ближе к началу координат. x y.
 */

public class Dot {
    private double x;
    private double y;

    public Dot compareLengthToStart(Dot secondDot){
        if (this.getLengthToStart()<=secondDot.getLengthToStart()) return this;
        else return secondDot;
    }

    public double getLengthToStart(){
        return Math.sqrt(x*x+y*y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
