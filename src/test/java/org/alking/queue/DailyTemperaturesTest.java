package org.alking.queue;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperaturesTest {

    @Test
    public void test(){

        DailyTemperatures dt = new DailyTemperatures();

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] calc = dt.dailyTemperatures(temperatures);
        Assert.assertArrayEquals(result, calc);
    }

}
