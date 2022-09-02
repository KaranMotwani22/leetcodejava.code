class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivotElement(nums);
        int ans = binarySearch(nums, target, 0, pivot);
        if(ans != -1){
            return ans;
        }
        else{
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        
    }
    int pivotElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            else if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
                if(target == arr[mid]){
                    return mid;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        return -1;
        }
    
}