package org.alking.queue;

import org.junit.Assert;
import org.junit.Test;

public class OpenLockTest {

    @Test
    public void openLockTest(){

        OpenLock openLock = new OpenLock();
        String[] deadends = {"8888"};
        String target = "0009";
        int steps = openLock.openLock(deadends,target);
        Assert.assertEquals(1,steps);

        deadends = new String[]{"0201","0101","0102","1212","2002"};
        target = "0202";
        steps = openLock.openLock(deadends,target);
        Assert.assertEquals(6,steps);

        deadends = new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"};
        target = "8888";
        steps = openLock.openLock(deadends,target);
        Assert.assertEquals(-1,steps);


        deadends = new String[]{"1102","1001","0111","0202","1000"};
        target = "0122";
        steps = openLock.openLock(deadends,target);
        Assert.assertEquals(5,steps);

    }
}
