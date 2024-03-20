class Solution {
public:
    string intToRoman(int num) {
        // Prepare ordered dictionary with array and pair
        pair<int,string> rmap[] = {
            {1000,"M"}, 
            {900,"CM"}, 
            {500, "D"}, 
            {400, "CD"}, 
            {100, "C"}, 
            {90, "XC"}, 
            {50, "L"}, 
            {40, "XL"}, 
            {10,"X"},
            {9,"IX"},
            {5, "V"}, 
            {4,"IV"}, 
            {1, "I"}
        };

        // Initialize pointer to the beginning of the array
        int rptr = 0;
        string str="";
        // Loop till the number is above 0
        while(num){
            // If numeric value at pointer is >= the number
            if(num>=(rmap[rptr]).first){
                // Add numeral to the answer
                str += (rmap[rptr]).second;
                // subtract numeric value from the number
                num -= (rmap[rptr]).first;
            }
            else{
                // Move pointer to the next biggest numeric value
                rptr++;
            }
        }
        return str;
    }
};
