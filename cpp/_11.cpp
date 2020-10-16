// container-with-most-water
// Problem Statement: https://leetcode.com/problems/container-with-most-water

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size() < 1)
            return 0;
        
        int left = 0;
        int right = height.size() - 1;
        int result = 0;
        
        while(left < right){
            int area = (height[left] < height[right]) ? (height[left] * (right - left)) : (height[right] * (right -left));          
            result = (area > result) ? area : result;
            (height[left] < height[right]) ? left++ : right--;
        }
        
        return result;
    }
};

