package org.alking.p0;

public class P11 {


    public int maxArea(int[] height) {


        if(height == null || height.length == 1){
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int result = Math.min(height[left],height[right]) * (right-left);
        while (left < right){


            if(height[left] < height[right]){
                left += 1;
            }else {
                right -= 1;
            }

            result = Math.max(result, Math.min(height[left],height[right]) * (right-left));

        }

        return result;
    }
}
