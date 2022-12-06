class Solution {
public:
        vector<vector<int> >dp;
    int ispalin(int i,int j,string &s){
        if(i>j||i==j)return 1;
        if(dp[i][j]!=-1)return dp[i][j];

        if(s[i]==s[j]){
            return dp[i][j]=ispalin(i+1,j-1,s);
        }
        return dp[i][j]=0;
    }
    string longestPalindrome(string s) {
        int n = s.length();
        int jf=0;int af=0;
        dp.resize(n,vector<int>(n,-1));
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ispalin(i,j,s)&&jf-af<j-i){
                    af=i;
                    jf=j;
                }
            }
        }
        string sf="";
        for(int i = af;i<=jf;i++){
            sf+=s[i];
        }
        return sf;
    }
};