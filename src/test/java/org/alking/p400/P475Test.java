package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P475Test {
    @Test
    public void test(){
        P475 p475 = new P475();
        int[] houses = new int[]{1,2,3};
        int[] heaters = new int[]{2};
        int result = p475.findRadius(houses,heaters);
        Assert.assertEquals(1,result);

        houses = new int[]{1,2,3,4};
        heaters = new int[]{1,4};
        result = p475.findRadius(houses,heaters);
        Assert.assertEquals(1,result);


        houses = new int[]{1,5};
        heaters = new int[]{2};
        result = p475.findRadius(houses,heaters);
        Assert.assertEquals(3,result);

        houses = new int[]{1,1,1,1,1,1,999,999,999,999};
        heaters = new int[]{499,500,501};
        result = p475.findRadius(houses,heaters);
        Assert.assertEquals(498,result);

        houses = new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
        heaters = new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
        result = p475.findRadius(houses,heaters);
        Assert.assertEquals(161834419,result);
    }
}
