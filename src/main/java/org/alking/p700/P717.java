package org.alking.p700;

public class P717 {

    public boolean isOneBitCharacter(int[] bits) {

        if (bits == null || bits.length == 0) {
            return false;
        }
        int size = bits.length;
        if (size == 1) {
            return true;
        }
        if (size == 2) {
            return bits[0] == 0;
        }
        int[] arr = new int[3];
        arr[0] = bits[size - 3];
        arr[1] = bits[size - 2];
        arr[2] = bits[size - 1];

        if(arr[1] == 0){
            return true;
        }

        int idx = 0;
        while (idx < (size-1)){
            idx += (bits[idx]+1);
        }
        return idx == (size -1);
    }
}
