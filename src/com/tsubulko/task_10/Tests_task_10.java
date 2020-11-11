package com.tsubulko.task_10;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Tests_task_10 {
    @Test
    public void checkResults(){
        TableFunction tableFunc = new TableFunction(2,8,2);
        HashMap<Double, Double> funcList = new HashMap<Double, Double>();
        funcList.put((double) 2, Math.tan(2));
        funcList.put((double) 4,  Math.tan(4));
        funcList.put((double) 6,  Math.tan(6));
        funcList.put((double) 8,  Math.tan(8));
        Assert.assertEquals(funcList,tableFunc.calculateFunction());
    }
}
