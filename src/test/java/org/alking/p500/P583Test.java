package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P583Test {

    @Test
    public void test(){
        P583 p583 = new P583();
        int result = p583.minDistance("sea","eat");
        Assert.assertEquals(2,result);
    }
}
