//Leetcode Link   : https://leetcode.com/problems/sum-of-all-subset-xor-totals?envType=daily-question&envId=2025-04-05

//Approach(Using optimal backtracking)
//T.C : O(2^n)
//S.C : O(n)

class Solution {

    private int solve(int i, int[] nums, int Xor) {
        if (i == nums.length) {
            return Xor;
        }

        int include = solve(i + 1, nums, nums[i] ^ Xor);
        int exclude = solve(i + 1, nums, Xor);

        return include + exclude;
    }

    public int subsetXORSum(int[] nums) {
        return solve(0, nums, 0);
    }
}
