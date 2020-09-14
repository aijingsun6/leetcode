package org.alking.p1400;

import java.util.ArrayList;
import java.util.List;

public class P1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;

        for( int v : candies){
            if(v > max){
                max = v;
            }
        }
        List<Boolean> result = new ArrayList<>(candies.length);

        for(int v: candies){

            if(v + extraCandies >= max){
                result.add(true);
            }else {
                result.add(false);
            }

        }
        return result;

    }
}
