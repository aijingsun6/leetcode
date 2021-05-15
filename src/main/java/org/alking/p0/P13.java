package org.alking.p0;

public class P13 {

    public int romanToInt(String s) {
        int acc = 0;
        int idx = 0;
        int size = s.length();
        while (idx < size) {
            char c = s.charAt(idx);
            idx += 1;

            if (c == 'M') {
                acc += 1000;
            } else if (c == 'D') {
                acc += 500;
            } else if (c == 'C') {
                if(idx < size){
                    c = s.charAt(idx);
                    if (c == 'M') {
                        idx += 1;
                        acc += 900;
                    } else if (c == 'D') {
                        idx += 1;
                        acc += 400;
                    } else {
                        acc += 100;
                    }
                }else {
                    acc += 100;
                }
            } else if (c == 'L') {
                acc += 50;
            } else if (c == 'X') {
                if(idx < size){
                    c = s.charAt(idx);
                    if (c == 'C') {
                        idx += 1;
                        acc += 90;
                    } else if (c == 'L') {
                        idx += 1;
                        acc += 40;
                    } else {
                        acc += 10;
                    }
                }else{
                    acc += 10;
                }

            } else if (c == 'V') {
                acc += 5;
            } else if (c == 'I') {
                if(idx < size){
                    c = s.charAt(idx);
                    if (c == 'X') {
                        idx += 1;
                        acc += 9;
                    } else if (c == 'V') {
                        idx += 1;
                        acc += 4;
                    } else {
                        acc += 1;
                    }
                }else{
                    acc += 1;
                }

            } else {
                throw new IllegalArgumentException(s);
            }
        }
        return acc;
    }
}
