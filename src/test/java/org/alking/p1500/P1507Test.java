package org.alking.p1500;

import org.junit.Assert;
import org.junit.Test;

public class P1507Test {

    @Test
    public void test(){
        P1507 p1507 = new P1507();
        Assert.assertEquals("2052-10-20",p1507.reformatDate("20th Oct 2052"));
    }
}
