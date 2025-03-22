class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
    
        // task:- 1  find the blue gola.........
        int gola_index = -1;
            
        for(int i = n-1; i > 0; i--){
            if(arr[i] > arr[i - 1]){
                gola_index = i-1;
                break;
            }
        }
        
        //if no such index found, reverse the array (last permutation)
        
        if(gola_index == -1){
            Arrays.sort(arr);
            return;
        }
        
        //task:- 2  find next greater element form gola_index
        
        int swap_index = gola_index;
        
        for(int j = n-1; j > gola_index; j--){
            if(arr[j] > arr[gola_index]){
                swap_index = j;
                break;
            }
        }
        
        //Task:- 3  swap
        //Arrays.swap(arr[gola_index], arr[swap_index])
        {
        int temp = arr[gola_index];
        arr[gola_index] = arr[swap_index];
        arr[swap_index] = temp;
        }
        
        //Task :- 4  sort array
        //Arryas.sort(arr_name , starting_index , last_index)
        Arrays.sort(arr, gola_index + 1, n);
        
        
    }
}
