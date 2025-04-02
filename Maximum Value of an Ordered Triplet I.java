// Leetcode Link  : https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i

// Approach-1 (Brute Force)
// T.C : O(n^3)
// S.C : O(1)
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long result = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    result = Math.max(result, (long)(nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        
        return result;
    }
}

// Approach-2 (Keeping track of maxDiff and maxi)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long result = 0;
        long maxDiff = 0;
        long maxi = 0;
        
        for (int k = 0; k < n; k++) {
            result = Math.max(result, maxDiff * nums[k]);
            maxDiff = Math.max(maxDiff, maxi - nums[k]);
            maxi = Math.max(maxi, nums[k]);
        }
        
        return result;
    }
}
