package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P459Test {

    @Test
    public void test(){
        P459 p459 = new P459();
        Assert.assertTrue(p459.repeatedSubstringPattern("abab"));
    }
}
