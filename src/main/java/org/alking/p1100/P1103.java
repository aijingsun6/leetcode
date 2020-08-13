package org.alking.p1100;

/**
 *  <a href="https://leetcode-cn.com/problems/distribute-candies-to-people/">1103. 分糖果 II</a>
 */
public class P1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] acc = new int[num_people];
        int num = 0;
        int idx = -1;
        int t = 0;
        while (candies > 0){

            idx = (idx + 1) % num_people;
            num = num + 1;
            if(candies <= num){
                acc[idx] = acc[idx] + candies;
                break;
            }else {
                acc[idx] = acc[idx] + num;
                candies = candies - num;
            }

        }
        return acc;
    }
}
