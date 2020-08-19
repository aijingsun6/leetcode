package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P647Test {

    @Test
    public void test() {
        P647 p647 = new P647();
        Assert.assertEquals(3, p647.countSubstrings("abc"));
        Assert.assertEquals(6, p647.countSubstrings("aaa"));
    }
}
