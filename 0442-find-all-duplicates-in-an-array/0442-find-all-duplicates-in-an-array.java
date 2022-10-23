class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(i != correct){
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
                list.add(arr[j]);
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