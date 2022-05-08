package org.alking.p400;

public class P413 {


    // 2 -> 1
    // 3 -> 3(1+2)
    // 4 -> 6(4*3/2)

    public int numberOfArithmeticSlices(int[] nums) {


        if (nums == null || nums.length < 3) {
            return 0;
        }
        int acc = 0;
        int leftPtr = 0;
        int rightPtr = 1;
        int gap = nums[1] - nums[0];
        while (true) {
            while ((rightPtr+1) < nums.length && nums[rightPtr + 1] - nums[rightPtr] == gap) {
                rightPtr++;
            }
            // [leftPtr,rightPtr]
            int add = (rightPtr - leftPtr) * (rightPtr - leftPtr - 1) / 2;
            acc += add;
            if((rightPtr+1)< nums.length){
                leftPtr = rightPtr;
                rightPtr = rightPtr +1;
                gap = nums[rightPtr] - nums[leftPtr];
            }else{
                break;
            }
        }
        return acc;

    }
}
