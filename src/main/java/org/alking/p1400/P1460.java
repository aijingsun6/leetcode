package org.alking.p1400;

import java.util.Arrays;

public class P1460 {

    public boolean canBeEqual(int[] target, int[] arr) {

        if(target == null && arr == null){
            return true;
        }

        if(target == null || arr == null){
            return false;
        }

        if(target.length != arr.length){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

}
