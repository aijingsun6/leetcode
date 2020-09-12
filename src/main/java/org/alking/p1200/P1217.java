package org.alking.p1200;

public class P1217 {

    public int minCostToMoveChips(int[] position) {

        int oddCnt = 0;
        int evenCnt = 0;

        for(int v : position){
            if(v % 2 == 0){
                evenCnt += 1;
            }else {
                oddCnt += 1;
            }
        }
        return Math.min(oddCnt,evenCnt);
    }
}
