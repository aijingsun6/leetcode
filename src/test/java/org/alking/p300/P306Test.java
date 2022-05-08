package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P306Test {

    @Test
    public void test() {
        P306 p306 = new P306();
        boolean result = p306.isAdditiveNumber("112358");
        Assert.assertTrue(result);

        result = p306.isAdditiveNumber("199100199");
        Assert.assertTrue(result);

        result = p306.isAdditiveNumber("19910011992");
        Assert.assertFalse(result);

        result = p306.isAdditiveNumber("198019823962");
        Assert.assertTrue(result);
    }
}
