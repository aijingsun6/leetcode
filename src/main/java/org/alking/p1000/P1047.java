package org.alking.p1000;


public class P1047 {


    public String removeDuplicates(String S) {
        if (S == null || S.length() < 2) {
            return S;
        }
        char[] arr = new char[S.length()];
        int idx = 0;
        for(int i = 0; i < S.length();i++){
            char c = S.charAt(i);
            if(idx > 0 && arr[idx-1] == c){
                idx --;
                continue;
            }
            arr[idx++] = c;
        }
        return new String(arr,0,idx);

    }


}
