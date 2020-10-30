package org.alking.p500;

public class P504 {

    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        boolean neg = num < 0;
        num = Math.abs(num);
        StringBuffer sb = new StringBuffer();

        while (num > 0){
            sb.append(num % 7);
            num = num / 7;
        }
        if(neg){
            sb.append("-");
        }
        return sb.reverse().toString();
    }

}
