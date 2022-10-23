class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0; 
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != i + 1 && correct < arr.length && correct >= 0){
                 if(arr[correct] != arr[i]) {
                        swap(arr, i, correct);
                    }
                    else{
                        i++;
                    }
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return arr.length + 1;
    }
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}