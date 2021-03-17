package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P115Test {

    @Test
    public void test(){
        P115 p115 = new P115();
        int result = p115.numDistinct("rabbbit","rabbit");
        Assert.assertTrue(result == 3);

        result = p115.numDistinct("babgbag","bag");
        Assert.assertTrue(result == 5);
    }
}
