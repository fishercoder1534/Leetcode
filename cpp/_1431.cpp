// Kids With the Greatest Number of Candies

class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
    
        vector<bool> v;
        int mx=0;
        
        for(int i=0;i<candies.size();i++){
            mx = max(mx,candies[i]);
        }
        
        for(int i=0;i<candies.size();i++){
            if(candies[i]+extraCandies<mx){
                v.push_back(false);
            }else{
                v.push_back(true);
            }
        }
        
        return v;
    }
};
