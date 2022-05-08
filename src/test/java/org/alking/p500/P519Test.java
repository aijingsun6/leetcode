package org.alking.p500;

import org.junit.Test;

public class P519Test {

    @Test
    public void test(){

        int m = 10;
        int n = 1;
        P519.Solution s = new P519.Solution(m,n);
        for(int i = 0; i < m*n; i ++){
            int[] t = s.flip();
            System.out.println(t[0] + "," + t[1]);
        }
    }
}
