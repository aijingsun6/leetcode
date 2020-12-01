package org.alking.p900;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P970 {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> set = new HashSet<>();
        int sumX = 1;
        while (sumX <= bound) {
            int sumY = 1;
            int sum;
            while ((sum = (sumX + sumY)) <= bound) {
                set.add(sum);
                if(y == 1){
                    break;
                }
                sumY *= y;
            }
            if(x == 1){
                break;
            }
            sumX *= x;
        }
        return new ArrayList<>(set);
    }
}
