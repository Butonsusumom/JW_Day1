package com.tsubulko.task_2;

/*
2.	Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце и корректно
определялись все високосные года.
 */

public class SpecificMonth {
    private int year;
    private int month;

    public boolean isYearLeap(){
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public int daysInMonth(){
        int days=0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               days=31;
               break;
            case 2:
                if (this.isYearLeap()) days=29;
                else days=28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
        }
        return days;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<1) this.year = 2020;
            else this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month<1){
            this.month = 1;
        }
        else {
            if (month > 12) {
                this.month = 12;
            }
            else this.month = month;
        }
    }

    public SpecificMonth(int year, int month) {
        if (year<1) this.year = 2020;
        else this.year = year;

        if (month<1){
            this.month = 1;
        }
        else {
            if (month > 12) {
                this.month = 12;
            }
            else this.month = month;
        }
    }

    @Override
    public String toString() {
        return "SpecificMonth{" +
                "year=" + year +
                ", month=" + month +
                '}';
    }
}
