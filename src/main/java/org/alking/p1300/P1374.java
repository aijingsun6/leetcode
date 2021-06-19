package org.alking.p1300;

import java.util.Arrays;

public class P1374 {

    public String generateTheString(int n) {

        char[] arr = new char[n];
        Arrays.fill(arr,'a');
        if(n %2 == 0){
            arr[n-1] = 'b';
        }
        return new String(arr);
    }
}
