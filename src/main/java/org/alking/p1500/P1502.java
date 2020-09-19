package org.alking.p1500;

import java.util.Arrays;

public class P1502 {

    public boolean canMakeArithmeticProgression(int[] arr) {

        if(arr == null || arr.length == 0){
            return false;
        }
        if(arr.length < 3){
            return true;
        }

        Arrays.sort(arr);

        int gap = arr[1] - arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i]-arr[i-1] != gap){
                return false;
            }
        }
        return true;

    }
}
