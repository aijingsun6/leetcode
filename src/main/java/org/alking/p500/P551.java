package org.alking.p500;

public class P551 {


    public boolean checkRecord(String s) {

        int abentCnt = 0;
        int lateStart = -1;
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c == 'A'){
                if(++abentCnt > 1){
                    return false;
                }
                lateStart = -1;
            }else if( c == 'L'){
                if(lateStart < 0){
                    lateStart = i;
                    continue;
                }
                if(lateStart >=0 && i-lateStart>1){
                    return false;
                }
            }else {
                lateStart = -1;
            }

        }
        return true;
    }
}
