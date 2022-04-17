package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P819Test {

    @Test
    public void test(){
        P819 p819 = new P819();
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] ban = new String[]{
                "hit"
        };
        String r = p819.mostCommonWord(para,ban);
        Assert.assertEquals("ball",r);
    }
}
