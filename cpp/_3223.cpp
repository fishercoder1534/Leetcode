class Solution {
public:
    int minimumLength(string s) {
        vector<int> freq(26, 0);
        for(char c : s) {
            freq[c - 'a']++;
        }
        int del = 0;
        for(int i = 0; i < 26; i++) {
            while(freq[i] >= 3) {
                freq[i] -= 2; 
                del += 2;  
            }
        } 
        return s.length() - del;
    }
};
