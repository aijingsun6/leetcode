package org.alking.p2000;

public class P2042 {

    public boolean areNumbersAscending(String s) {
        int prev = 0;
        int acc = 0;
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c == ' '){
                if(acc > 0){
                    if(acc <= prev){
                        return false;
                    }
                    prev = acc;
                    acc = 0;
                }
            }else if(c >= '0' && c <= '9'){
                acc = acc * 10 + c  - '0';
            }
        }
        if(acc > 0 && acc <= prev){
            return false;
        }
        return true;

    }
}
