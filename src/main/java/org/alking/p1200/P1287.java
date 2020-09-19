package org.alking.p1200;

public class P1287 {

    public int findSpecialInteger(int[] arr) {

        int limit = arr.length / 4;
        int count = 0;
        int tmp = arr[0];
        for(int idx = 1; idx < arr.length; idx ++){
            int v = arr[idx];
            if(v == tmp){
                count += 1;
            }else {
                tmp = v;
                count = 1;
            }
            if(count > limit){
                return v;
            }

        }
        return tmp;
    }
}
