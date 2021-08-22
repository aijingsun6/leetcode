package org.alking.p1600;

import java.util.Arrays;

public class P1672 {

    public int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int i = 0; i < accounts.length;i++){
            max = Math.max(max,Arrays.stream(accounts[i]).sum());
        }
        return max;

    }
}
