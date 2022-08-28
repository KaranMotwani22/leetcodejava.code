class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        double result=0;
        vector<int> v;
        for(int i=0;i<nums1.size();i++){
            v.push_back(nums1[i]);
        }
        for(int i=0;i<nums2.size();i++){
            v.push_back(nums2[i]);
        }
        sort(v.begin(),v.end());
         int mid=v.size()/2;
        if(v.size()%2==0){
            result=v[mid]+v[mid-1];
            return result/2;
        }
        return v[mid];
    }
};