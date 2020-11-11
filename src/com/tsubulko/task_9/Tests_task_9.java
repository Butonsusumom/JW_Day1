package com.tsubulko.task_9;

import com.tsubulko.task_8.Function;
import org.junit.Assert;
import org.junit.Test;

public class Tests_task_9 {

    @Test
    public void countSquare(){
        Circles cir = new Circles (6);
        Assert.assertEquals( 113, cir.getSquare(),0.1);
    }

    @Test
    public void countLength(){
        Circles cir = new Circles (6);
        Assert.assertEquals(37.6, cir.getLength(),0.1);
    }
}
