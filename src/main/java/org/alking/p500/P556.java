package org.alking.p500;

import java.util.ArrayList;
import java.util.Collections;

public class P556 {


    public int nextGreaterElement(int num) {
        long max = num % 10;
        long n = num / 10;
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(max);
        long find = -1;
        while (n > 0 && find < 0) {
            long m = n % 10;
            arr.add(m);
            n = n / 10;
            if (m >= max) {
                max = m;
            } else {
                find = m;
            }
        }
        if (find < 0) {
            return -1;
        }
        Long min = (long) Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            Long v = arr.get(i);
            if (v > find && v < min) {
                min = v;
            }
        }
        arr.remove(min);
        n = n * 10 + min;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            n = n * 10 + arr.get(i);
        }

        if(n > Integer.MAX_VALUE || n < Integer.MIN_VALUE){
            return -1;
        }
        return (int)n;
    }
}
