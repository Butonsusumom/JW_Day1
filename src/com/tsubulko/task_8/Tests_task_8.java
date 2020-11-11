package com.tsubulko.task_8;

import org.junit.Assert;
import org.junit.Test;

public class Tests_task_8 {
    @Test
    public void testMoreThanThree(){
        Function func = new Function (6);
        Assert.assertEquals(-9, func.calculateFunction(),0.1);
    }

    @Test
    public void testMoreLessThree(){
        Function func = new Function (2);
        Assert.assertEquals(0.5, func.calculateFunction(),0.1);
    }
}
