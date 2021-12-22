package org.alking.p600;

public class P686 {

    public int repeatedStringMatch(String a, String b) {
        final int sizeA = a.length();
        final int sizeB = b.length();
        StringBuilder sb = new StringBuilder();
        int count = (int) Math.ceil(sizeB / sizeA);
        for (int i = 0; i < count; i++) {
            sb.append(a);
        }
        if (sb.indexOf(b) > -1) {
            return count;
        }
        for (int i = 0; i < 2; i++) {
            count++;
            sb.append(a);
            if (sb.indexOf(b) > -1) {
                return count;
            }
        }
        return -1;
    }

}
