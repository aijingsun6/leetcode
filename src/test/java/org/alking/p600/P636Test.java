package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P636Test {

    @Test
    public void test(){
        P636 p636 = new P636();
        int n = 2;
        List<String> logs = Arrays.asList(
                "0:start:0",
                "1:start:2",
                "1:end:5",
                "0:end:6");

        int[] result = p636.exclusiveTime(n,logs);
        int[] expect = new int[]{3,4};
        Assert.assertArrayEquals(expect,result);

        logs = Arrays.asList("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
        n = 1;
        expect = new int[]{8};
        result = p636.exclusiveTime(n,logs);
        Assert.assertArrayEquals(expect,result);

        logs = Arrays.asList("0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7");
        n = 2;
        result = p636.exclusiveTime(n,logs);
        expect = new int[]{7,1};
        Assert.assertArrayEquals(expect,result);

    }
}
