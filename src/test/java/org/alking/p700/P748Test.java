package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P748Test {

    @Test
    public void test(){
        P748 p748 = new P748();
        String licensePlate = "GAn3936";
        String[] words = new String[]{"picture","community","stuff","above","be","around","can","father","avoid","agent"};
        String res = p748.shortestCompletingWord(licensePlate,words);
        Assert.assertEquals("agent",res);

        licensePlate = "1s3 456";
        words = new String[]{"looks", "pest", "stew", "show"};
        res = p748.shortestCompletingWord(licensePlate,words);
        Assert.assertEquals("pest",res);

    }
}
