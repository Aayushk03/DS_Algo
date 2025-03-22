class Solution {
    public void nextPermutation(int[] nums) {
        //find pivot
        int pivot = -1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            Arrays.sort(nums);  // in place changes
            return;            
        }

        // to find right most elemnt > pivot and swap (RME, Piovt)
        for(int i = nums.length-1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }

        }

        //reverse (pivot + 1) to nums.length - 1

        int i = pivot + 1 ;
        int j = nums.length - 1;
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
