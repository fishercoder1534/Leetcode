class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
       /*if(x%10==0 && x!=0)
           return false;*/
        int ans = 0;
        int t = x;
        int p  = 0;
        while(x!=0){
            p++;
            x/=10;
        }
        p--;
        x= t;
        while(x!=0){
            int d = x%10;
            ans = ans + (int)Math.pow(10,p--)*d;
            x = x/10;
            //p++;
        }
        if(ans==t)
            return true;
        else
            return false;
    }
}