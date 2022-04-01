package org.alking.p2000;

import org.junit.Assert;
import org.junit.Test;

public class P2024Test {

    @Test
    public void test(){
        P2024 p2024 = new P2024();
        String s = "TTFF";
        int k = 2;
        int result = p2024.maxConsecutiveAnswers(s,k);
        Assert.assertEquals(4,result);

        s = "TFFT";
        k = 1;
        result = p2024.maxConsecutiveAnswers(s,k);
        Assert.assertEquals(3,result);

        s = "TTFTTFTT";
        k = 1;
        result = p2024.maxConsecutiveAnswers(s,k);
        Assert.assertEquals(5,result);

    }
}
