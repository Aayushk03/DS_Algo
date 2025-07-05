/*
Leetcode Link : https://leetcode.com/problems/find-lucky-integer-in-an-array
Approach (Using fixed size array to store frequency)
T.C : O(n)
S.C : O(501) ~ O(1)
*/

class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for (int num : arr) {
            freq[num]++;
        }
        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
