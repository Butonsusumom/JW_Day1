package com.tsubulko.task_8;

/*
8. Вычислить значение функции
 */

public class Function {
    private double x;

    public double calculateFunction(){
        if (x >= 3) return calucalteMoreThanThree(x);
        else return calucalteLessThanThree(x);
    }

    private double calucalteMoreThanThree(double a){
        return 3*a-a*a+9;
    }

    private double calucalteLessThanThree(double a){
        return 1/(a*a*a-6);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Function(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Function{" +
                "x=" + x +
                '}';
    }
}
