package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P43Test {

    @Test
    public void addTest() {
        P43 p43 = new P43();
        List<Integer> ret = p43.add(Arrays.asList(Arrays.asList(1), Arrays.asList(2)));
        Assert.assertTrue(3 == ret.get(0));

        ret = p43.add(Arrays.asList(Arrays.asList(1, 0, 0), Arrays.asList(2, 0, 0)));
        Assert.assertTrue(3 == ret.get(0));
        Assert.assertTrue(0 == ret.get(1));
        Assert.assertTrue(0 == ret.get(2));
    }

    @Test
    public void multiplyTest(){
        P43 p43 = new P43();
        Assert.assertEquals("121", p43.multiply("11","11"));
        Assert.assertEquals("56088", p43.multiply("123","456"));
    }
}
