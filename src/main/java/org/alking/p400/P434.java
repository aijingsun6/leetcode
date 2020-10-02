package org.alking.p400;

public class P434 {

    public int countSegments(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] arr = s.toCharArray();
        if(arr.length == 1 && arr[0] != ' '){
            return 1;
        }
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ' ' && arr[i - 1] != ' ') {
                count += 1;
            }
        }
        if (arr[arr.length - 1] == ' ') {
            count -= 1;
        }

        return count + 1;
    }
}
