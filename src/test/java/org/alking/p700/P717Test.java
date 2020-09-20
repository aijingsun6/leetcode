package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P717Test {

    @Test
    public void test(){
        P717 p717 = new P717();
        int[] bits = new int[]{1,1,1,0};
        boolean check  = p717.isOneBitCharacter(bits);
        Assert.assertFalse(check);
    }
}
