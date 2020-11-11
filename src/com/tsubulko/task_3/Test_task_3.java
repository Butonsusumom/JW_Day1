package com.tsubulko.task_3;

import com.tsubulko.task_2.SpecificMonth;
import org.junit.Assert;
import org.junit.Test;

public class Test_task_3 {

    @Test
    public void biggerInTimes(){
        Square sq = new Square(4);
        Circle cr = new Circle(sq.getRadiusOfInnerCircle());
        Assert.assertEquals(2,sq.getSquare()/cr.getSquareOfInnerSquare(), 0.1);
    }

    @Test
    public void checkRadius(){
        Square sq = new Square(4);
        Circle cr = new Circle(sq.getRadiusOfInnerCircle());
        Assert.assertEquals(sq.getSide()/2,cr.getRadius(), 0.1);
    }

    @Test
    public void chackdiagonal(){
        Circle cr = new Circle(4);
        Square sq = new Square(cr.getSquareOfInnerSquare());
        Assert.assertEquals(sq.getDiagonal(),cr.getRadius()*2, 0.1);
    }
}
