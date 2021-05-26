package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

public class P1652Test {

    @Test
    public void test(){
        P1652 p1652 = new P1652();
        int[] code = new int[]{5,7,1,4};
        int[] result = p1652.decrypt(code,3);
        int[] except = new int[]{12,10,16,13};
        Assert.assertArrayEquals(except,result);

        code = new int[]{2,4,9,3};
        result = p1652.decrypt(code,-2);
        except = new int[]{12,5,6,13};
        Assert.assertArrayEquals(except,result);
    }
}
