package com.tsubulko.task_1;

import org.junit.Assert;
import org.junit.Test;


public class Tests_task_1 {

    @Test
    public void TestZero(){
        Number a= new Number(10);
        Assert.assertEquals(0,a.getLastSquareDigit());
    }

    @Test
    public void TestOne(){
        Number a= new Number(1119);
        Number b= new Number(111);
        Assert.assertEquals(b.getLastSquareDigit(),a.getLastSquareDigit());
    }

    @Test
    public void TestFour(){
        Number b= new Number(222);
        Assert.assertEquals(4,b.getLastSquareDigit());
    }

    @Test
    public void TestFive(){
        Number b= new Number(5);
        Assert.assertEquals(5,b.getLastSquareDigit());
    }

    @Test
    public void TestSix(){
        Number b= new Number(44444);
        Assert.assertEquals(6,b.getLastSquareDigit());
    }

    @Test
    public void TestNight(){
        Number b= new Number(9873);
        Assert.assertEquals(9,b.getLastSquareDigit());
    }
}
