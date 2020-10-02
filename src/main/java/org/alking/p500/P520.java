package org.alking.p500;

public class P520 {

    public boolean detectCapitalUse(String word) {

        char[] arr = word.toCharArray();
        int upperCnt = 0;
        int lowCnt = 0;
        for(char c : arr){

            if(c >= 'A' && c <= 'Z'){
                upperCnt += 1;
            }else {
                lowCnt += 1;
            }

            if(lowCnt > 0 && upperCnt > 1){
                return false;
            }
        }


        if(lowCnt == 0){
            return true;
        }
        if(upperCnt == 0){
            return true;
        }
        if(upperCnt == arr.length){
            return true;
        }
        if(upperCnt == 1 && arr[0] >= 'A' && arr[0] <= 'Z'){
            return true;
        }
        return false;

    }
}
