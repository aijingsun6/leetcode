package org.alking.p1700;

public class P1742 {

    private int boxCnt(int limit) {
        int pow = 1;
        while (Math.pow(10, pow) < limit) {
            pow++;
        }
        return 9 * pow;
    }

    private int boxNum(int n){
        int acc = 0;
        while (n > 0){
            acc += (n % 10);
            n = n/10;
        }
        return acc;
    }

    public int countBalls(int lowLimit, int highLimit) {

        int cnt = boxCnt(highLimit);
        int[] dp = new int[cnt + 1];
        for(int i = lowLimit;i <= highLimit;i++){
            int num = boxNum(i);
            dp[num] ++;
        }
        int max = 0;
        for(int i = 0;i <= cnt;i++){
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
