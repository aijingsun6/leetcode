package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P448Test {

    @Test
    public void test(){
        P448 p448 = new P448();
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = p448.findDisappearedNumbers(arr);
        Assert.assertEquals(2, result.size());
    }
}
