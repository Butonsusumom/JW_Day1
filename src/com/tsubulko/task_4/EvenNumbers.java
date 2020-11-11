package com.tsubulko.task_4;

/*
4.	Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

public class EvenNumbers {
    private int a;
    private int b;
    private int c;
    private int d;

    public boolean checkCondition(){
        return (isEven(a)+isEven(b)+isEven(c)+isEven(d) > 1);
    }

    public int isEven(int num){
        if (num % 2 ==0) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Tests_task_4{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public EvenNumbers(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
