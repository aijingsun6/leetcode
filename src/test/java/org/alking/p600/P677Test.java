package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P677Test {

    @Test
    public void test(){
        P677.MapSum mapSum = new P677.MapSum();
        mapSum.insert("apple",3);
        int sum = mapSum.sum("ap");
        Assert.assertEquals(3,sum);

        mapSum.insert("app",2);
        sum = mapSum.sum("ap");
        Assert.assertEquals(5,sum);

    }
}
