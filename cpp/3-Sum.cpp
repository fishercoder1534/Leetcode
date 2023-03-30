class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
   
        //
        vector<vector<int>> res;
        //sort
        sort(nums.begin(),nums.end());
        
        for(unsigned int i = 0; i < nums.size();i++){
             // initialize left and right 
           //to handle duplicates
            if(i > 0 && nums[i]==nums[i-1])
                continue;
             int l = i + 1; 
            int r = nums.size() - 1; 
            int x = nums[i]; 
            
            while (l < r) 
            {    
                if (x + nums[l] + nums[r] == 0) {
                    res.push_back(vector<int>{x,nums[l],nums[r]});
                    //to handle duplicates
                    while (l<r && nums[l] == nums[l+1]) 
                        l++;
                    // to handle duplicates
                    while (l<r && nums[r] == nums[r-1]) 
                        r--;
                    l++;
                    r--;
                    //break;
                }
                // If sum of three elements is less 
                // than zero then increment in left 
                else if (x + nums[l] + nums[r] < 0) 
                    l++; 
  
                // if sum is greater than zero than 
                // decrement in right side 
                else
                    r--; 
            }
                
        }
        return res;
    }
};
