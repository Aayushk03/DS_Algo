// leedCode qus Number 2140

// Example 1:

// Input: questions = [[3,2],[4,3],[4,4],[2,5]]
// Output: 5
// Explanation: The maximum points can be earned by solving questions 0 and 3.
// - Solve question 0: Earn 3 points, will be unable to solve the next 2 questions
// - Unable to solve questions 1 and 2
// - Solve question 3: Earn 2 points
// Total points earned: 3 + 2 = 5. There is no other way to earn 5 or more points.

class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;

        if(n == 1)
            return questions[0][0];
        
        long [] t = new long[200001];

        for(int i = n-1; i >= 0; i--){
            t[i] = Math.max(questions[i][0] + t[i + questions[i][1] + 1], t[i + 1]);
        }

        return t[0];
    }
}
