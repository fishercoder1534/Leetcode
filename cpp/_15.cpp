class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        
        vector<vector<int>> v;
        
        if(nums.size()<3){
            //if vector nums has less than 3 elements, impossible to distribute into 3 element set -> return 0.
            return v;
        }
        
        for(int i=0;i<nums.size();i++){
            
            if(i>0 and nums[i]==nums[i-1]){
                //same elements dont have to be taken.
                continue;
            }
            
            int l = i+1, r = nums.size()-1;
            //Using 2-pointer concept
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum>0){
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    v.push_back(vector<int> {nums[i],nums[l],nums[r]});
                    while(l<r and nums[l]==nums[l+1]) l++;
                    while(l<r and nums[r]==nums[r-1]) r--;
                    l++; r--;
                }
            }
            
        }
        
        return v;
    }
};
