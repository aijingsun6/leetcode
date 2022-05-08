package org.alking.p400;

import org.junit.Test;

public class P476Test {

    @Test
    public void test(){
        int n = -100;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n >> 1));
        System.out.println(Integer.toBinaryString(n >>> 1));
    }
}
