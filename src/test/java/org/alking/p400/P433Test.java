package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P433Test {

    @Test
    public void test(){
        P433 p433 = new P433();
        String start = "AACCGGTT";
        String end = "AACCGGTA";
        String[] bank = new String[]{
                "AACCGGTA"
        };
        int r = p433.minMutation(start,end,bank);
        Assert.assertEquals(1,r);

        start = "AACCGGTT";
        end = "AAACGGTA";
        bank = new String[]{
                "AACCGGTA","AACCGCTA","AAACGGTA"
        };
        r = p433.minMutation(start,end,bank);
        Assert.assertEquals(2,r);

        start = "AAAAACCC";
        end = "AACCCCCC";
        bank = new String[]{
                "AAAACCCC","AAACCCCC","AACCCCCC"
        };
        r = p433.minMutation(start,end,bank);
        Assert.assertEquals(3,r);

    }
}
