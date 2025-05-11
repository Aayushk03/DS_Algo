//Leetcode Link   : https://leetcode.com/problems/three-consecutive-odds?envType=daily-question&envId=2025-05-11
//T.C : O(n)
//S.C : O(1)

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consecutiveOdd = 0;
        if(arr.length < 3){
            return false;
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 ==0){
                consecutiveOdd = 0;
            }
            else{
                consecutiveOdd++;
            }
            if(consecutiveOdd == 3){
                return true;
            }
        }
        return false;
    }
}
