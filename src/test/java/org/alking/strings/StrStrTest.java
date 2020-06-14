package org.alking.strings;

import org.junit.Assert;
import org.junit.Test;

public class StrStrTest {

    @Test
    public void  strStrTest() {
        StrStr ss = new StrStr();
        Assert.assertEquals(2,ss.strStr("hello","ll"));
    }
}
