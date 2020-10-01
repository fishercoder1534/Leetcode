class Solution {
public:
    string countAndSay(int n) {
        string arr[n+1];
        arr[0]=to_string(0);
        arr[1]=to_string(1);
        for(int i=2;i<=n;i++)
        {
            arr[i]=cas(arr[i-1]);
        }
        return arr[n];
        
    }
    
    string cas(string n)
    {
        
        string ans="";
     
        while(!n.empty())
        {string p=n.substr(0,1);
        int cnt=0;int i=0;
        while(n.substr(i,1)==p)
        {cnt++;i++;}
         n.erase(0,cnt);
         ans+=to_string(cnt)+p;
         }
        return ans;
    }
    
    
};
