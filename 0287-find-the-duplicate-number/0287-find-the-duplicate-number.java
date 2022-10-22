class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
         while(i < arr.length){
             int correct = arr[i] - 1;
             if(arr[i] != i + 1){
                 if(arr[correct] != arr[i]){
                     swap(arr, i, correct);
                 }
                 else{
                     return arr[i];
                 }
             }
             else{
                 i++;
             }
         }
        return arr[arr.length - 1];
    }
    void swap(int[] arr, int a, int b){
       int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
        
    }