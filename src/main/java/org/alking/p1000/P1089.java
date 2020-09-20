package org.alking.p1000;

public class P1089 {

    public void duplicateZeros(int[] arr) {

        if(arr == null || arr.length < 1){
            return;
        }

        int idx = 0;
        while (idx < arr.length){

            if(arr[idx] == 0){
                for(int i = arr.length-1; i >= idx+2;i--){
                    arr[i] = arr[i-1];
                }
                if(idx < arr.length-1){
                    arr[idx+1] = 0;
                }

                idx += 2;
            }else {
                idx += 1;
            }

        }

    }
}
