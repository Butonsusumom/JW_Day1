package com.tsubulko.task_2;

import org.junit.Assert;
import org.junit.Test;

public class Test_task_2 {

    @Test
    public void leapYear(){
        SpecificMonth a= new SpecificMonth(1764, 2);
        Assert.assertEquals(true,a.isYearLeap());
        Assert.assertEquals(29,a.daysInMonth());
    }

    @Test
    public void notLeapYear(){
        SpecificMonth a= new SpecificMonth(2019, 2);
        Assert.assertEquals(false,a.isYearLeap());
        Assert.assertEquals(28,a.daysInMonth());
    }

    @Test
    public void thirtyDays(){
        SpecificMonth a= new SpecificMonth(2019, 11);
        Assert.assertEquals(30,a.daysInMonth());
    }

    @Test
    public void thirtyOneDays(){
        SpecificMonth a= new SpecificMonth(2019, 12);
        Assert.assertEquals(31,a.daysInMonth());
    }

    @Test
    public void incorrectMonth(){
        SpecificMonth a= new SpecificMonth(2019, 14);
        Assert.assertEquals(12,a.getMonth());
        SpecificMonth b= new SpecificMonth(2019, -19);
        Assert.assertEquals(1,b.getMonth());
    }

    @Test
    public void incorrectYear(){
        SpecificMonth a= new SpecificMonth(-6, 11);
        Assert.assertEquals(2020,a.getYear());
    }
}
