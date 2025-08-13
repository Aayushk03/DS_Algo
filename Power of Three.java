/*
Leetcode Link : https://leetcode.com/problems/power-of-three/description
Approach- Using logarithms and checking if log base 3 of n is an integer
T.C : O(1)
S.C : O(1)
*/

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        double logValue = Math.log10(n) / Math.log10(3);

        // Check if logValue is an integer
        return logValue == (int)logValue;
    }
}
