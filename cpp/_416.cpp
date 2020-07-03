//416. Partition Equal Subset Sum

class Solution {
public:
    //maximum size top-down dp table
    bool dp[201][20001];
    
    bool equalPart(vector<int>& arr,int size,int sum){
        for(int i=0;i<=size;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=sum;i++){
            dp[0][i]=false;
        }
        
        for(int i=1;i<=size;i++){
            for(int j=1;j<=sum;j++){
                 
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                
            }
        }
        
        return dp[size][sum];
    }
    
    bool canPartition(vector<int>& nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }else{
            return equalPart(nums,nums.size(),sum/2);
        }
    }
};
