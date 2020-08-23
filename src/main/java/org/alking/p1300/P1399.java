package org.alking.p1300;

import java.util.HashMap;
import java.util.Map;

public class P1399 {

    public int countLargestGroup(int n) {

        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for( int i = 1; i <= n ;i++){
            int sum = calcSum(i);
            int count = map.getOrDefault(sum,0) + 1;
            map.put(sum, count);
            if(count > max){
                max = count;
            }
        }
        int result = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() == max){
                result += 1;
            }
        }
        return result;
    }

    private int calcSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
