package org.alking.p1400;

import org.junit.Test;

public class P1405Test {

    @Test
    public void test(){
        P1405 p1405 = new P1405();
        int a = 1;
        int b = 1;
        int c = 7;
        String s = p1405.longestDiverseString(a,b,c);
        System.out.println(s);
    }
}
