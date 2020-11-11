package com.tsubulko.task_4;


import org.junit.Assert;
import org.junit.Test;

public class Tests_task_4 {

    @Test
    public void oneEven(){
        EvenNumbers numbers = new EvenNumbers(3,1,4,1);
        Assert.assertEquals(false, numbers.checkCondition());
    }

    @Test
    public void twoEven(){
        EvenNumbers numbers = new EvenNumbers(2,7,8,9);
        Assert.assertEquals(true, numbers.checkCondition());
    }

    @Test
    public void treeEven(){
        EvenNumbers numbers = new EvenNumbers(2,26,28,3);
        Assert.assertEquals(true, numbers.checkCondition());
    }

    @Test
    public void fourEven(){
        EvenNumbers numbers = new EvenNumbers(12,4,6,8);
        Assert.assertEquals(true, numbers.checkCondition());
    }

}
