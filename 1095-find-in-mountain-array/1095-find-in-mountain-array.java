/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        if(arr.length() < 3){
            return -1;
        }
        int peak = peakElement(arr);
        int a = binarySearch(arr, target, 0, peak);
        if(a != -1){
            return a;
        }
        else{
            return descBinarySearch(arr, target, peak + 1, arr.length() - 1);
        }
        
    
    }
    int peakElement(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr.get(mid) > arr.get(mid + 1)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    int binarySearch(MountainArray arr, int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr.get(mid)){
                return mid;
         }
            else if(target < arr.get(mid)){
             end = mid - 1;
         }
            else{
                start = mid + 1;
            }
        }
        return -1;
        
    }
    int descBinarySearch(MountainArray arr, int target,int start,int end){
        while(start <= end){
             int mid = start + (end - start)/2;
             if(target == arr.get(mid)){
                 return mid;
             }
            else if(target < arr.get(mid)){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
}