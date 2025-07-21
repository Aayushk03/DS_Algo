/*
Leetcode Link : https://leetcode.com/problems/delete-characters-to-make-fancy-string
Approach (Simple straight forward traversal)
T.C : O(n)
S.C : O(1)
*/

class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();

        // Start with the first character
        result.append(s.charAt(0));
        int freq = 1;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == result.charAt(result.length() - 1)) {
                freq++;
                if (freq < 3) {
                    result.append(s.charAt(i));
                }
            } else {
                result.append(s.charAt(i));
                freq = 1;
            }
        }

        return result.toString();
    }
}
