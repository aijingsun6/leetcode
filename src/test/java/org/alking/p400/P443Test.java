package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P443Test {

    @Test
    public void test(){
        P443 p443 = new P443();
        char[] chars  = "aabbccc".toCharArray();
        int result = p443.compress(chars);
        Assert.assertEquals(6, result);

        chars  = "abbbbbbbbbbbb".toCharArray();
        result = p443.compress(chars);
        Assert.assertEquals(4, result);
    }
}
