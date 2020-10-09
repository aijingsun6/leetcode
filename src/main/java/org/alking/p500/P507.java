package org.alking.p500;

public class P507 {

    public boolean checkPerfectNumber(int num) {
        if(num < 2){
            return false;
        }
        int sqrt = (int)Math.sqrt(num);
        int sum = 0;
        for(int i = sqrt;i > 1; i--){
            if(i * i == num){
                sum += i;
            }else if(num % i == 0){
                sum += i;
                sum += num / i ;
            }
        }
        sum += 1;
        return sum == num;
    }
}
