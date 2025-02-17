package com.practice.core.array;

import java.util.Arrays;

public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); // Sort in ascending order
        
        
        System.out.println(Arrays.toString(nums));
        
        return nums[nums.length - k]; // k-th largest element
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));
    }
}
