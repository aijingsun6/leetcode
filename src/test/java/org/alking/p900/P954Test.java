package org.alking.p900;

import org.junit.Assert;
import org.junit.Test;

public class P954Test {

    @Test
    public void test(){
        P954 p954 = new P954();
        int[] arr = new int[]{3,1,3,6};
        boolean result = p954.canReorderDoubled(arr);
        Assert.assertFalse(result);

        arr = new int[]{2,1,2,6};
        result = p954.canReorderDoubled(arr);
        Assert.assertFalse(result);

        arr = new int[]{4,-2,2,-4};
        result = p954.canReorderDoubled(arr);
        Assert.assertTrue(result);

        arr = new int[]{0,0,1,2,4,8};
        result = p954.canReorderDoubled(arr);
        Assert.assertTrue(result);
    }
}
