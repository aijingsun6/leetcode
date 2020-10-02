package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P383Test {

    @Test
    public void test(){
        P383 p383 = new P383();
        Assert.assertFalse(p383.canConstruct2("a","b"));
    }
}
