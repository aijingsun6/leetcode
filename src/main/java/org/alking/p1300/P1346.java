package org.alking.p1300;

public class P1346 {

    public boolean checkIfExist(int[] arr) {

        if (arr == null || arr.length < 2) {
            return false;
        }


        int min = arr[0];
        int max = arr[0];
        for(int v : arr){
            if(v < min){
                min = v;
            }
            if(v > max){
                max = v;
            }
        }

        int[] cache = new int[max - min + 1];
        for (int v : arr) {
            int idx = v - min;
            cache[idx] += 1;
        }



        for (int v : arr) {
            if(v == 0){

                int idx = v - min;
                if(idx >=0 && idx< cache.length&& cache[idx] > 1){
                    return true;
                }
                continue;
            }

            int idx = v * 2 - min;
            if (idx >= 0 && idx < cache.length && cache[idx] > 0) {
                return true;
            }

        }
        return false;
    }
}
