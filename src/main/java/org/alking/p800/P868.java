package org.alking.p800;

public class P868 {


    public int binaryGap(int n) {

        String s = Integer.toBinaryString(n);
        char[] arr = s.toCharArray();
        int max = 0;
        int last = -1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == '1'){
                if(last < 0){
                    last = i;
                }else {
                    max = Math.max(max, i - last);
                    last = i;
                }
            }
        }
        return max;
    }
}
