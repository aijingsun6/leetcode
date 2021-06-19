package org.alking.p1200;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P1239Test {

    @Test
    public void test(){
        P1239 p1239 = new P1239();
        List<String> arr = Arrays.asList(
                "un","iq","ue"
        );
        int result = p1239.maxLength(arr);
        int expect = 4;
        Assert.assertEquals(expect,result);

        arr = Arrays.asList(
                "cha","r","act","ers"
        );
        result = p1239.maxLength(arr);
        expect = 6;
        Assert.assertEquals(expect,result);
    }
}
