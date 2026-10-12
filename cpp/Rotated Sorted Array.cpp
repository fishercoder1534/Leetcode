class Solution {
public:

int search(vector<int>& nums, int target) 
{
    int n = nums.size();
    int index = -1, left = 0, right = n-1;
    while(left <= right)
    {
        int mid = left + (right - left) / 2;
        if(mid > 0 && nums[mid] < nums[mid-1]) 
        {
            index = mid - 1;
            break;
        }
        if(mid < n-1 && nums[mid] > nums[mid+1])
        {
            index = mid;
            break;
        }
        if(nums[mid] > nums[right]) left = mid + 1;
        else right = mid - 1;
    }
    left = 0, right = index;
    while(left <= right)
    {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) right = mid-1;
        else left = mid + 1;
    }
    left = index + 1, right = n - 1;
    while(left <= right)
    {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) right = mid - 1;
        else left = mid + 1;
    }
    return -1;
}
};
