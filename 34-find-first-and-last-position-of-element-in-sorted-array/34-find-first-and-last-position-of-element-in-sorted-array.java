class Solution {
    public int[] searchRange(int[] nums, int target) {
        int FirstOccurence = search(nums, target, true);
        int LastOccurence = search(nums, target, false);
        return new int[]{FirstOccurence, LastOccurence};
        
    }
    int search(int[] arr, int target, boolean a){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(a){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}