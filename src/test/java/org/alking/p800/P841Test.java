package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P841Test {

    @Test
    public void test(){
        P841 p841 = new P841();
        List<List<Integer>> rooms  = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Collections.emptyList()
        );
        Assert.assertTrue(p841.canVisitAllRooms(rooms));
    }
}
