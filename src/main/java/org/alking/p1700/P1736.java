package org.alking.p1700;

public class P1736 {


    public String maximumTime(String time) {

        char[] arr = time.toCharArray();
        // 0,1,3,4
        if (arr[0] == '?' && arr[1] == '?') {
            arr[0] = '2';
            arr[1] = '3';
        } else if (arr[0] == '?' && arr[1] < '4') {
            arr[0] = '2';
        } else if (arr[0] == '?') {
            arr[0] = '1';
        } else if (arr[1] == '?' && arr[0] < '2') {
            arr[1] = '9';
        } else if (arr[1] == '?') {
            arr[1] = '3';
        }
        if (arr[3] == '?') {
            arr[3] = '5';
        }
        if (arr[4] == '?') {
            arr[4] = '9';
        }
        return new String(arr);
    }
}
