package easy;

public class PaintFence {
    public int numWays(int n, int k) {
        if(n == 0) return 0;
        else if(n == 1) return k;
        int sameColorCnt = k, diffColorCnt = k*(k-1);
        for(int i = 2; i < n; i++){
            int temp = diffColorCnt;
            diffColorCnt = (diffColorCnt+sameColorCnt)*(k-1);
            sameColorCnt = temp;
        }
        return sameColorCnt+diffColorCnt;
    }
}
