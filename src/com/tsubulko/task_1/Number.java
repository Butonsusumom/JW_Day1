package com.tsubulko.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
 1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
*/


public class Number {
    private int number;

    public int getLastSquareDigit(){
        int lastDigit = 0;
        switch (number % 10){
            case 2:
            case 8:
                lastDigit = 4;
                break;
            case 3:
            case 7:
                lastDigit = 9;
                break;
            case 4:
                lastDigit = 6;
                break;
            case 9:
                lastDigit = 1;
                break;
            default:lastDigit = number % 10;
        }
        return  lastDigit;
    }

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
