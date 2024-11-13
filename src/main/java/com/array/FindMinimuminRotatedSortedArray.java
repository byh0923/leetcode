package com.array;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            //(left + right) / 2 => 하면 (left + right)가 overflow 발생할 수 있음
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }


        return nums[left];
    }

    public static void main(String[] args) {
        FindMinimuminRotatedSortedArray solution = new FindMinimuminRotatedSortedArray();
        System.out.println(solution.findMin(new int[] {3,4,5,1,2}));
    }
}
