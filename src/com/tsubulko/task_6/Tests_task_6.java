package com.tsubulko.task_6;

import org.junit.Assert;
import org.junit.Test;

public class Tests_task_6 {
    @Test
    public void simpleTest(){
        Moment moment = new Moment( 6000);
        Assert.assertEquals(1, moment.getHours());
        Assert.assertEquals(40, moment.getMinutes());
        Assert.assertEquals(0, moment.getSeconds());
    }

    @Test
    public void outOfTime(){
        Moment moment = new Moment( 90000);
        Assert.assertEquals(24, moment.getHours());
        Assert.assertEquals(0, moment.getMinutes());
        Assert.assertEquals(0, moment.getSeconds());
        Assert.assertEquals(86400, moment.getStartSeconds());
    }

    @Test
    public void FullDay(){
        Moment moment = new Moment( 86400);
        Assert.assertEquals(24, moment.getHours());
        Assert.assertEquals(0, moment.getMinutes());
        Assert.assertEquals(0, moment.getSeconds());
    }
}
