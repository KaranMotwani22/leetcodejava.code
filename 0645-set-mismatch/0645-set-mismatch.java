class Solution {
    public int[] findErrorNums(int[] arr) {
        int i = 0; 
        while(i < arr.length){  
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                return new int[]{arr[j], j + 1};
            }
        }
        return new int[]{-1, -1};
    }
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
} 