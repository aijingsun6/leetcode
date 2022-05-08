package org.alking.p300;


public class P306 {

    public boolean isAdditiveNumber(String num) {
        char[] arr = num.toCharArray();
        for (int i = 1; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (arr[i] == '0' && (j - i > 1)) {
                    continue;
                }
                if (check(arr, 0, i, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(char[] array, int start1, int end1, int start2, int end2) {

        char[] r = add(array, start1, end1, start2, end2);

        if (end2 + r.length > array.length) {
            return false;
        } else {
            // end2 + r.length <= array.length
            for (int i = 0; i < r.length; i++) {
                if (array[end2 + i] != r[i]) {
                    return false;
                }
            }
            if (end2 + r.length == array.length) {
                return true;
            }
            return check(array, start2, end2, end2, end2 + r.length);
        }

    }

    private char[] add(char[] arr, final int start1, int end1, final int start2, int end2) {
        int size = Math.max(end1 - start1, end2 - start2);
        char[] buf = new char[size];
        int add = 0;
        int idx = size - 1;
        end1--;
        end2--;
        while (end1 >= start1 && end2 >= start2) {
            int sum = arr[end1] - '0' + arr[end2] - '0' + add;
            buf[idx--] = (char) (sum % 10 + '0');
            add = sum > 9 ? 1:0;
            end1--;
            end2--;
        }

        while (end1 >= start1) {
            int sum = arr[end1] - '0' + add;
            buf[idx--] = (char) (sum % 10 + '0');
            add = sum > 9 ? 1:0;
            end1--;
        }
        while (end2 >= start2) {
            int sum = arr[end2] - '0' + add;
            buf[idx--] = (char) (sum % 10 + '0');
            add = sum > 9 ? 1:0;
            end2--;
        }

        if (add > 0) {
            char[] result = new char[size + 1];
            result[0] = '1';
            System.arraycopy(buf, 0, result, 1, size);
            return result;
        }
        return buf;
    }
}
