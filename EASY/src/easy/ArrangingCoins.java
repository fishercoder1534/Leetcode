package easy;

public class ArrangingCoins {

    public static int arrangeCoins(int n) {
        if(n < 2) return n;
        int row = 0, count = 0;
        long sum = 0;
        while(sum < n){
            row += 1;
            sum += row;
            count++;
        }
        if(sum == n) return count;
        return count-1;
    }

    public static void main(String...args){
        int n = 3;//should be 2
        System.out.println(arrangeCoins(n));
    }
}
