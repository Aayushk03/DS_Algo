// leedCode qus Number 2460

class Solution {
    public int[] applyOperations(int[] nums) {
    // 1 pass Approach


         //simulation Part
         int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(i+1 <nums.length && nums[i] == nums[i+1] && nums[i] != 0){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }


            if(nums[i] != 0){
                if(i != j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }


        }
         
        return nums;
    }

}


//2 pass Approach

class Solution {
    public int[] applyOperations(int[] nums) {
         simulation Part
        for(int i = 0; i<nums.length-1; i++ ){
            if(nums[i] == nums[i+1] && nums[i] != 0){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int j = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j < nums.length){
                nums[j] = 0;
                j++;
        }
        return nums;
    }

}

       
