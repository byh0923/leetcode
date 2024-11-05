package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // 2 7 11 15, 9
        for (int i = 0; i < nums.length; i++) {
            int compareNum = target - nums[i];

            if (map.containsKey(compareNum)) {
                return new int[] {map.get(compareNum), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No Two Sum solution");
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] input = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum.twoSum(input, target);
        Arrays.stream(result).forEach(x -> System.out.print(x));
    }

}
