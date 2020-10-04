class Solution {
public:
    int maxSatisfaction(vector<int>& sat) {
        // we'll greedily only consider a suffix of the sorted array
        sort(sat.begin(), sat.end());
        int cmax = 0;
        int sum = 0; 
        int csum = 0; 
        int i = sat.size(); // iterate from n - 1 to 0
        while(i--) {
            // calulate current satisfaction
            csum += sat[i];
            sum += csum;
            // compare with cmax
            cmax = max(cmax, sum);
        }
        return cmax;
    }
};
