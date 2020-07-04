//Partition to K Equal Sum Subsets

class Solution {
public:
    
    bool dfs(vector<int> &nums, vector<int> visited, int idx,int k,int currSum,int targetSum){
        if(k==1){
            //All subsets are found
            return true;
        }
        if(currSum==targetSum){
            //one subset found
            return dfs(nums,visited,0,k-1,0,targetSum);
        }
        for(int i=idx;i<nums.size();i++){
            if(!visited[i]){
                visited[i]=true;
                if(dfs(nums,visited,i+1,k,currSum+nums[i],targetSum)){
                    return true;
                }
                visited[i]=false;
            }
        }
        return false;
    }
    bool canPartitionKSubsets(vector<int>& nums, int k) {
        vector<int> visited(nums.size(),false);
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum += nums[i];
        }
        if(sum%k!=0){
            return false;
        }
        return dfs(nums,visited,0,k,0,sum/k);
    }
};
