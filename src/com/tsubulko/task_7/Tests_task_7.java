package com.tsubulko.task_7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests_task_7 {

        Dot dot1 = new Dot( 3,4);
        Dot dot2 = new Dot( 12,5);

    @Test
    public void compareTest(){
        Assert.assertEquals(dot1, dot1.compareLengthToStart(dot2));
        Assert.assertEquals(dot1, dot2.compareLengthToStart(dot1));
    }

    @Test
    public void calculateTest(){
        Assert.assertEquals(5, dot1.getLengthToStart(),0.1);
        Assert.assertEquals(13, dot2.getLengthToStart(),0.1);
    }
}
