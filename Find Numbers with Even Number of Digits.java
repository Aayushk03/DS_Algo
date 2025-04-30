//Leetcode Link   :https://leetcode.com/problems/find-numbers-with-even-number-of-digits?envType=daily-question&envId=2025-04-30
// T.C : O(n)
// S.C : O(1)

class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;

        for (int n : nums) {
            if ((n > 9 && n < 100) || (n > 999 && n < 10000) || n == 100000) {
                res++;
            }
        }

        return res;        
    }
}
