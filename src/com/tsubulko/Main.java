package com.tsubulko;

import com.tsubulko.task_1.Number;
import com.tsubulko.task_10.TableFunction;
import com.tsubulko.task_2.SpecificMonth;
import com.tsubulko.task_3.Square;
import com.tsubulko.task_3.Circle;
import com.tsubulko.task_4.EvenNumbers;
import com.tsubulko.task_5.PerfectNumber;
import com.tsubulko.task_6.Moment;
import com.tsubulko.task_7.Dot;
import com.tsubulko.task_8.Function;
import com.tsubulko.task_9.Circles;


import java.io.IOException;
import org.apache.log4j.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
        final Logger log = Logger.getLogger(Main.class);

        // Task 1
        log.info("Start Task 1");
	    Number a= new Number(10);
        System.out.println("The last digit of this numbers square:");
        System.out.println(a.getLastSquareDigit());
        System.in.read();

        // Task 2
        log.info("Start Task 2");
        SpecificMonth month= new SpecificMonth(1764, 2);
        System.out.println("Is year a leap?");
        System.out.println(month.isYearLeap());
        System.out.println("Number of days in current month:");
        System.out.println(month.daysInMonth());
        System.in.read();

        // Task 3
        log.info("Start Task 3");
        Square sq = new Square(4);
        Circle cr = new Circle(sq.getRadiusOfInnerCircle());
        System.out.println("Square of inner square:");
        System.out.println(cr.getSquareOfInnerSquare());
        System.out.println("In how many times inner square is smaller:");
        System.out.println(sq.getSquare()/cr.getSquareOfInnerSquare());
        System.in.read();

        // Task 4
        log.info("Start Task 4");
        EvenNumbers numbers = new EvenNumbers(2,7,8,9);
        System.out.println("Is two or more of numbers are even?");
        System.out.println(numbers.checkCondition());
        System.in.read();

        // Task 5
        log.info("Start Task 5");
        PerfectNumber perfectNumber = new PerfectNumber(6);
        System.out.println("Is it a perfect number?");
        System.out.println(perfectNumber.isPerfectNumber());
        System.in.read();

        // Task 6
        log.info("Start Task 6");
        Moment moment = new Moment( 76400);
        System.out.println("Now is:");
        System.out.println(moment);
        System.in.read();

        // Task 7
        log.info("Start Task 7");
        Dot dot1 = new Dot( 3,4);
        Dot dot2 = new Dot( 12,5);
        System.out.println("Length to the begin of coordinates from 1 dot:");
        System.out.println(dot1.getLengthToStart());
        System.out.println("Length to the begin of coordinates from 2 dot:");
        System.out.println(dot2.getLengthToStart());
        System.out.println("Close to the begin of coordinates is:");
        System.out.println(dot1.compareLengthToStart(dot2));
        System.in.read();

        // Task 8
        log.info("Start Task 8");
        Function func = new Function (6);
        System.out.println("The function with current parametr:");
        System.out.println(func.calculateFunction());
        System.in.read();

        // Task 9
        log.info("Start Task 9");
        Circles cir = new Circles (6);
        System.out.println("The length of circle:");
        System.out.println(cir.getLength());
        System.out.println("The square of circle:");
        System.out.println(cir.getSquare());
        System.in.read();

        // Task 10
        log.info("Start Task 10");
        TableFunction tableFunc = new TableFunction(2,8,2);
        tableFunc.drawTable();
    }
}

