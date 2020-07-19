//Solution 1: Using Array Frequency Method

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
        if(s.find_first_not_of(' ') != string::npos){
            // There's a non-space && visit array ~ 127 ascii chars.
            int visit[150];
            memset(visit,0,sizeof(visit));
            
            int mx=0,x=0;
            for(int i=0;i<s.size();i++){
                if(visit[s[i]]==0){
                    visit[s[i]]++;
                    x++;
                }else{
                    mx = max(mx,x);
                    //back to (i-x) index for relooping from the double occurance
                    if(x>0) i-=x;
                    x=0;
                    memset(visit,0,sizeof(visit));
                }
            }
            mx = max(x,mx);
            return mx;
        }else{
            // There's a only white-spaces.
            if(s.size()>0) return 1;
            else return 0;
        }
        
    }
};

//Solutio 2: Using Map Method (High Memory and Time)

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    
        unordered_map <char,int> ump;
            
        int mx=0,x=0;
        for(int i=0;i<s.size();i++){
            if(ump[s[i]]==0){
                ump[s[i]]++;
                x++;
            }else{
                mx = max(mx,x);
                //back to (i-x) index for relooping from the double occurance
                if(x>0) i-=x;
                x=0;
                ump.clear();
            }
        }
        mx = max(x,mx);
        return mx;
        
    }
};
