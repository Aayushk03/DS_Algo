/*
    Leetcode Link  : https://leetcode.com/problems/count-hills-and-valleys-in-an-array
    Approach (Simple loop)
    T.C : O(n) 
    S.C : O(1)
*/

class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;

        int i = 0; // points to non-equal neighbor on the left-hand side
        int j = 1; // points to non-equal neighbor on the right-hand side by [j+1]

        int count = 0;
        while (j + 1 < n) {
            if ((nums[i] < nums[j] && nums[j] > nums[j + 1])
                    ||
                (nums[i] > nums[j] && nums[j] < nums[j + 1])) {
                count++;
                i = j;
            }

            j++;
        }

        return count;
    }
}
