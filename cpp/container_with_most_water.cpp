class Solution {
public:
    int maxArea(vector<int>& h) {
        int n = h.size();
        int i = 0, j = n - 1;
        int ans = 0,height;
        while(i < j)
        {
            if(h[i] < h[j]){
            height = h[i];
            ans = max(ans, (j - i)*height);i++;}
            else{
            height = h[j];
            ans = max(ans, (j - i)*height);j--;}
        }
        return ans;
    }
};
