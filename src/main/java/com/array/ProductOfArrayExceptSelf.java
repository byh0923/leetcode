package com.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];


        result[0] = 1;
        for(int i=1; i<size; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int rightProduct = 1;
        for(int i=size-1; i>=0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = new int[]{1, 2, 3, 4};
        Arrays.stream(solution.productExceptSelf(nums)).forEach(x -> System.out.println(x));
    }
}
