package org.alking.p1300;

public class P1394 {

    // 1 <= arr[i] <= 500
    public int findLucky(int[] arr) {
        int min = 1;
        int max = 500;
        int[] cache = new int[max+1];
        for( int v : arr){
            cache[v] += 1;
        }

        for(int idx = max; idx >= min; idx--){

            if(cache[idx] == idx){
                return idx;
            }

        }
        return -1;
    }
}
