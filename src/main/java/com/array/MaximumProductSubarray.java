package com.array;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int maxNum = nums[0];
        int minNum = nums[0];

        for (int i=1; i<nums.length; i++) {
            int currentNum = nums[i];

            if(currentNum < 0) {
                int temp = minNum;
                minNum = maxNum;
                maxNum = temp;
            }

            maxNum = Math.max(currentNum, currentNum * maxNum);
            minNum = Math.min(currentNum, currentNum * minNum);
            result = Math.max(result, maxNum);
        }
        return result;
    }

    public static void main(String[] args) {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        System.out.println(solution.maxProduct(new int[] {2,3,-2,4}));
    }

}
