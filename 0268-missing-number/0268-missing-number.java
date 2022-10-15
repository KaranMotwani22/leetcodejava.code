class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(i != correct && correct < nums.length){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length;
        
    }
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}