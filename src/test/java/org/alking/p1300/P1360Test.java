package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1360Test {

    @Test
    public void test(){
        P1360 p1360 = new P1360();
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        int diff = p1360.daysBetweenDates(date1,date2);
        Assert.assertEquals(1,diff);
    }
}
