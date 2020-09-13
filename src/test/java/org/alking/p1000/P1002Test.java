package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P1002Test {

    @Test
    public void test(){
        P1002 p1002 = new P1002();
        String[] strArr = new String[]{"bella","label","roller"};
        List<String> ret = p1002.commonChars(strArr);
        Assert.assertEquals(3, ret.size());
    }
}
