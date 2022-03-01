package org.alking.offer;

import org.junit.Assert;
import org.junit.Test;

public class O5Test {

    @Test
    public void test(){
        O5 o5 = new O5();
        String first = "pale";
        String second = "pal";
        Assert.assertTrue(o5.oneEditAway(first,second));

        first = "pales";
        second = "pal";
        Assert.assertFalse(o5.oneEditAway(first,second));
    }
}
