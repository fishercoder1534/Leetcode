// coin-change
// Problem Statement: https://leetcode.com/problems/coin-change/

class Solution{
public:
    int coinChange(vector<int>& coins, int amount){
        
        int MAX = amount + 1;
        vector<int> cache(amount + 1, MAX);
        
        cache[0] = 0;
        for(auto coin : coins){
            for(int i = coin; i <= amount; i++)
                cache[i] = std::min(cache[i], cache[i - coin] + 1);
        }
        
        return cache[amount] == MAX ? -1 : cache[amount];
    }
};

