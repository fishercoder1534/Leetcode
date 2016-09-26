package easy;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        if(isBadVersion(left)) return left;
        
        while(left+1 < right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)) right = mid;
            else left = mid;
        }
        
        if(isBadVersion(left)) return left;
        return right;
    }

    private boolean isBadVersion(int left) {
        //this is a fake method to make Eclipse happy
        return false;
    }

    
}
