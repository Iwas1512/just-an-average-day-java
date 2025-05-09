package org.example;

public class ArrayOperations {

    public static int maximumUsingForLoop(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int minimumUsingForLoop(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int sumUsingForLoop(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double averageUsingForLoop(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0.0;
        }
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }

    public static int maximumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        return java.util.Arrays.stream(nums)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public static int minimumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        return java.util.Arrays.stream(nums)
                .min()
                .orElse(Integer.MAX_VALUE);
    }

    public static int sumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        return java.util.Arrays.stream(nums)
                .sum();
    }

    public static double averageUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0.0;
        }
        
        return java.util.Arrays.stream(nums)
                .average()
                .orElse(0.0);
    }
}