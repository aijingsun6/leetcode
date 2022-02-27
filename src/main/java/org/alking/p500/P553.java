package org.alking.p500;

public class P553 {

    public String optimalDivision(int[] nums) {

        if (nums == null || nums.length == 0) {
            return "";
        }
        if (nums.length == 1) {
            return String.valueOf(nums[0]);
        }
        if (nums.length == 2) {
            return String.format("%d/%d", nums[0], nums[1]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0])
                .append("/")
                .append("(")
                .append(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sb.append("/").append(nums[i]);
        }
        sb.append(")");
        return sb.toString();
    }
}
