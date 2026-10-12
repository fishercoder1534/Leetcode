class Solution {
public:
    bool canBeValid(string s, string locked) {
        int n = s.size();
        for(int i = 0;i<n;i++)
        {
            if(locked[i]=='0')
            s[i] = '*';
        }
        cout<<s<<endl;
        stack<int> open,star;
        for(int i = 0;i<n;i++)
        {
            if(s[i]=='(') open.push(i);
            else if(s[i]=='*') star.push(i);
            else if(s[i]==')')
            {
                if(!open.empty()) open.pop();
                else if(!star.empty()) star.pop();
                else return false;
            }
        }
        while(!open.empty() && !star.empty() && open.top() < star.top())
        {
            open.pop();
            star.pop();
        }
        if(star.size()%2)
        return false;
        return (open.empty());
    }
};
