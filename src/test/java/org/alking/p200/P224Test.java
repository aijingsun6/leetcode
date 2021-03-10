package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P224Test {

    @Test
    public void test(){
        P224 p224 = new P224();
        int ret = p224.calculate("1+1");
        Assert.assertTrue(ret == 2);
        ret = p224.calculate(" 2-1 + 2 ");
        Assert.assertTrue(ret == 3);

        ret = p224.calculate(" (1+(4+5+2)-3)+(6+8) ");
        Assert.assertTrue(ret == 23);

    }
}
