package com.array;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            max = Math.max(max, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        MaximumSubArray solution = new MaximumSubArray();
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
