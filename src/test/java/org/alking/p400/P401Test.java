package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P401Test {

    @Test
    public void test() {
        P401 p401 = new P401();
        List<String> res = p401.readBinaryWatch(1);
        Assert.assertEquals(10, res.size());
        res = p401.readBinaryWatch(2);
    }
}
