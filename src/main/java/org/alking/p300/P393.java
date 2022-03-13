package org.alking.p300;

public class P393 {

    public boolean validUtf8(int[] data) {
        int start = 0;
        while (start < data.length) {
            int v = data[start];
            if (v < 0b10000000) {
                start++;
                continue;
            }
            int size;
            if ((v & 0b11111000) == 0b11110000) {
                size = 4;
            }else if((v&0b11110000) == 0b11100000){
                size = 3;
            }else if((v& 0b11100000) == 0b11000000){
                size = 2;
            }else {
                return false;
            }
            if (start + size > data.length) {
                return false;
            }
            for (int i = 1; i < size; i++) {
                if ((data[start + i] & 0b11000000) != 0b10000000) {
                    return false;
                }
            }
            start += size;
        }
        return true;
    }
}
