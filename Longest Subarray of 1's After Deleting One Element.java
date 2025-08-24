/*
  Leetcode Link : https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
  
*/

class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0;
        int lastZeroIndex = -1;
        int result = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                i = lastZeroIndex + 1;
                lastZeroIndex = j;
            }
            result = Math.max(result, j - i);
            j++;
        }

        return result;
    }
}
