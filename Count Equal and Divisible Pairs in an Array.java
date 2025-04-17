//Leetcode Link   : https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array?envType=daily-question&envId=2025-04-17

//T.C : O(n^2)
//S.C : O(1)

class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && (i * j) % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
