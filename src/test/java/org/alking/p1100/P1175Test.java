package org.alking.p1100;

import org.junit.Assert;
import org.junit.Test;

public class P1175Test {

    @Test
    public void test(){
        P1175 p1175 = new P1175();
        Assert.assertEquals(12,p1175.numPrimeArrangements(5));
        Assert.assertEquals(682289015,p1175.numPrimeArrangements(100));

    }
}
