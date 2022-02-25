package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P537Test {

    @Test
    public void test(){
        P537 p537 = new P537();
        int[] n = p537.parseComplex("1+1i");
        Assert.assertArrayEquals(new int[]{1,1},n);
        String s = p537.complexNumberMultiply("1+1i","1+1i");
        Assert.assertEquals("0+2i",s);

        s = p537.complexNumberMultiply("1+-1i","1+-1i");
        Assert.assertEquals("0+-2i",s);

    }
}
