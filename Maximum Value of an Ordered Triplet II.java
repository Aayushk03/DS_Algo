// Leetcode Link  : https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii?envType=daily-question&envId=2025-04-03

// Approach (Keeping track of maxDiff and maxi)
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
