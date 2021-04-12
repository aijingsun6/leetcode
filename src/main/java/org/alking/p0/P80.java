package org.alking.p0;

public class P80 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int idx = 0;
        int ptr = 0;
        int n = nums.length;
        while (ptr < n) {
            int v = nums[ptr];
            int cnt = 1;
            while ((++ptr) < n && nums[ptr] == v) {
                cnt++;
            }
            nums[idx++] = v;
            if (cnt > 1) {
                nums[idx++] = v;
            }

        }
        return idx;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int idx = 0;
        int last = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length;i++){
            int v = nums[i];
            if(cnt < 1){
                nums[idx++]=v;
                last = v;
                cnt = 1;
            }else if(v == last && cnt < 2){
                nums[idx++] = v;
                cnt += 1;
            }else if(v != last){
                nums[idx++] = v;
                last = v;
                cnt = 1;
            }
        }

        return idx;
    }
}
