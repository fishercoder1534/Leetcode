class Solution {
public:
    void nextPermutation(vector<int>& nums) {
    
        int i1;
        int i2;
        bool hasPermutation = false;
        
        for(int i=nums.size()-1; i>0; i--){
            if(nums[i-1]<nums[i]){
                i1 = i-1;
                i2 = i;
                hasPermutation = true;
                break;
            }
        }
        
        if(hasPermutation){
            int j=i2;
            for(int i=nums.size()-1; i>i1; i--){
                if(nums[i]>nums[i1]){
                    j=i;
                    break;
                }
            }
            swap(nums[i1], nums[j]);
            reverse(nums.begin()+i1+1, nums.end());
        }else{
            sort(nums.begin(), nums.end());
        }
  
    }
};
