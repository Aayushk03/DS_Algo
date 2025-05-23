//Leetcode Link   : https://leetcode.com/problems/count-subarrays-with-score-less-than-k?envType=daily-question&envId=2025-04-28
//Approach  (Sliding Window)
//T.C : O(n)
//S.C : O(1)


class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        
        long result = 0;
        long sum = 0;
        
        int i = 0;
        int j = 0;
        
        while (j < n) {
            sum += nums[j];
            
            while (i <= j && sum * (j - i + 1) >= k) {
                sum -= nums[i];
                i++;
            }
            
            result += (j - i + 1);
            j++;
        }
        
        return result;
    }
}
