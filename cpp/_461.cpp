// Hamming Distance

class Solution {
public:
    int hammingDistance(int x, int y) {
        int c = x^y;
        return __builtin_popcount(c);
    }
};
