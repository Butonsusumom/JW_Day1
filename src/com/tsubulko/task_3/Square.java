package com.tsubulko.task_3;

/*
3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

public class Square {
    private double square;
    private double side;
    private double diagonal;


    public double getRadiusOfInnerCircle(){
        return side/2;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public Square(double square) {
        this.square = square;
        this.side=  Math.sqrt(square);
        this.diagonal=side*Math.sqrt(2);
    }
}
