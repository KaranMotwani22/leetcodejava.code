class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
            int i = 0;
            List<Integer> list = new ArrayList<>();
            while(i < arr.length){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct] && correct < arr.length){
                    swap(arr, i, correct);
                }
                else{
                    i++;
                }

            }
        for(int j = 0; j < arr.length; j++){
            if(j != arr[j] - 1){
                list.add(j + 1);
                
            }
        }
        return list;
        
    }
     void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
