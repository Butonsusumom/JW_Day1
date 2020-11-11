package com.tsubulko.task_5;


import org.junit.Assert;
import org.junit.Test;

public class Tests_task_5 {

    @Test
    public void perfectNumber(){
        PerfectNumber number = new PerfectNumber(6);
        Assert.assertEquals(true, number.isPerfectNumber());
    }

    @Test
    public void notPerfectNumber(){
        PerfectNumber number = new PerfectNumber(2020);
        Assert.assertEquals(false, number.isPerfectNumber());
    }
}
