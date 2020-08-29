package org.alking.p600;


public class P605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed == null || flowerbed.length < 1) {
            return false;
        }

        int idx = 0;
        int count = 0;
        int size = flowerbed.length;
        boolean left;
        boolean right;
        while (idx < size){
            // calc left enable
            left = flowerbed[idx] == 0;
            if(!left){
                idx += 1;
                continue;
            }
            if(idx == 0){
                left = true;
            }else {
                left = flowerbed[idx-1] == 0;
            }
            if(!left){
                idx += 1;
                continue;
            }
            // calc right enable
            if(idx == size-1){
                right = true;
            } else {
                right = flowerbed[idx + 1] == 0;
            }
            if(!right){
                idx += 1;
                continue;
            }

            count += 1;

            if(count >= n){
                return true;
            }
            flowerbed[idx] = 1;
            idx += 1;


        }

        return count >= n;


    }
}
