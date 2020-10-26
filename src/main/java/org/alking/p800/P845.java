package org.alking.p800;

public class P845 {
    static final int STATE_NONE = 0;
    static final int STATE_AFTER_VALLEY = 1;
    static final int STATE_BEFORE_VALLEY = 2;

    public int longestMountain(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        if (arr.length == 3) {
            return arr[1] > arr[0] && arr[1] > arr[2] ? 3 : 0;
        }
        int state = STATE_NONE;
        int max = 0;
        int start = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            switch (state) {
                case STATE_NONE:
                    if(idx > 0 && arr[idx-1]< arr[idx]){
                        start = idx - 1;
                        state = STATE_AFTER_VALLEY;
                    }
                    break;
                case STATE_AFTER_VALLEY:

                    if(arr[idx] < arr[idx-1]){
                        max = Math.max(max, idx - start + 1);
                        state = STATE_BEFORE_VALLEY;
                    }else if(arr[idx] == arr[idx-1]){
                        state = STATE_NONE;
                    }
                    break;
                case STATE_BEFORE_VALLEY:
                   if(arr[idx] < arr[idx-1]){
                       max = Math.max(max, idx - start + 1);
                   }else if(arr[idx] > arr[idx-1]){
                       start = idx -1;
                       state = STATE_AFTER_VALLEY;
                   }else {
                       state = STATE_NONE;
                   }
                    break;
                default:
                    break;
            }
        }
        return max;
    }
}
