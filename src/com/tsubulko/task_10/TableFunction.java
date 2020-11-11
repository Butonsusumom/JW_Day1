package com.tsubulko.task_10;

/*
10.	Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
 Результат представить в виде таблицы, первый столбец которой – значения аргумента,
 второй - соответствующие значения функции.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableFunction {
    private double a;
    private double b;
    private double h;

    public HashMap<Double, Double> calculateFunction (){
        HashMap<Double, Double> funcList = new HashMap<Double, Double>();
        double x = a;
        while (x<=b){
            funcList.put(x,Math.tan(x));
            x += h;
        }
        return funcList;
    }

    public void drawTable(){
        HashMap<Double, Double> funcList = this.calculateFunction();
        for(Map.Entry<Double, Double> entry : funcList.entrySet()) {
            Double key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(entry);
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public TableFunction( double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String toString() {
        return "TableFunction{" +
                " a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
