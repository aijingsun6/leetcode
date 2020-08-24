package org.alking.p400;

import java.util.ArrayList;
import java.util.List;

public class P459 {

    public boolean repeatedSubstringPattern(String s) {

        if(s == null || s.length() == 0){
            return false;
        }

        List<Integer> nums = findNum(s.length());

        for(Integer n: nums){

            String sub = s.substring(0, n);

            String s2 = s.replace(sub,"");

            if(s2.isEmpty()){
                return true;
            }

        }
        return false;


    }


    private List<Integer> findNum(int s) {

       List<Integer> acc = new ArrayList<>();
        int start = 1;
        int end = s;
        int end2 = 0;
        while (start <= end) {
            if (s % start == 0) {
                end2 = s / start;
                if(end2 > 1){
                    acc.add(start);
                    acc.add(end2);
                    end = end2;
                }

            }
            start += 1;
        }
        return acc;
    }
}
