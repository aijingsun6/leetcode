package org.alking.p1500;

public class P1556 {

    public String thousandSeparator(int n) {
        if(n == 0){
            return "0";
        }
        boolean negative = n < 0;
        n = Math.abs(n);
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while (n > 0) {
            sb.append(n % 10);
            n = n / 10;
            cnt++;
            if(n > 0 && cnt %3 == 0){
                sb.append(".");
            }
        }
        return negative? "-" +sb.reverse().toString():sb.reverse().toString();
    }
}
