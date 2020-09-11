package org.alking.p900;

public class P922 {

    public int[] sortArrayByParityII(int[] A) {

        int[] result = new int[A.length];
        int oddIdx = 1;
        int evenIdx = 0;
        for(int v: A){
            if(v %2 == 0){
                result[evenIdx] = v;
                evenIdx += 2;
            }else {
                result[oddIdx] = v;
                oddIdx += 2;
            }
        }
        return result;

    }

}
