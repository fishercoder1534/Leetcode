/**
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> m;
        vector<int> result;
        for(int i=0; i<nums.size(); i++){
        // not found the second one
            if (m.find(nums[i])==m.end() ) {
            // store the first one poisition into the second one's key
                m[target - nums[i]] = i;
            }else {
            // found the second one
                result.push_back(m[nums[i]]);
                result.push_back(i);
                break;
            }
        }
        return result;
    }
};