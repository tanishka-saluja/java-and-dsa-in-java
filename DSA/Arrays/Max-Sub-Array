/*
Problem: Maximum Subarray (Kadane’s Algorithm)
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEnding = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }
}
