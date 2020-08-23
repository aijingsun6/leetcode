package org.alking.p1500;

/**
 * <a href="https://leetcode-cn.com/problems/count-odd-numbers-in-an-interval-range/">1523. 在区间范围内统计奇数数目</a>
 */
public class P1523 {

    public int countOdds(int low, int high) {

        if(low %2 == 0){
            low = low + 1;
        }
        if(high % 2 == 0){
            high = high -1;
        }
        return (high-low)/2 + 1;
    }
}
