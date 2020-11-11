package com.tsubulko.task_5;


/*
5.	Составить программу, печатающую значение true, если указанное высказывание является истинным,
и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
 */
public class PerfectNumber {
    private int number;

    public boolean isPerfectNumber(){
        if (sumOfDividers(number)==number) return true;
        else return false;
    }

    public int sumOfDividers(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PerfectNumber(int number) {
        this.number = number;
    }
}
