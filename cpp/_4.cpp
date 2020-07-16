class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        //for adding second vector to last of first vector
        nums1.insert(nums1.end(),nums2.begin(),nums2.end());
        sort(nums1.begin(),nums1.end());
        
        int size = nums1.size();
        float sum = nums1[size/2];
        
        if(size%2==0){
            sum += nums1[(size/2)-1];
            sum/=2;
        }
        
        return (float)(sum);
    }
};
