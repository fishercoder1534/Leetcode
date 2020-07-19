//Faster than 100% submissions

class Solution {
public:
    int reverse(int x) {
        
        long int res = 0;
        
        bool isMinus = false;
        //To add the minus sign if any negative number
        if(x<0){
            isMinus = true;
        }
        
        //convert into positive number
        x = abs(x);
        
        //Function to reverse number
        while(x>0){
            int last = x%10;
            res = res*10 + last;
            x/=10;
        }
        
        //Adding minus sign in the result
        if(isMinus){
            res *= -1;
        }
        //Range of int
        int mn = -2147483648, mx =  2147483647;
        
        //Checking if is in range of int
        if(res > mn and res < mx){
            res = res;
        }else{
            res = 0;
        }
        
        return res;
    }
};
