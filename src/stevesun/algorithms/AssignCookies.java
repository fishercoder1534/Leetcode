package stevesun.algorithms;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int result = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length;){
            if (s[j] >= g[i]) {
                result++;
                i++;
            }
            j++;
        }
        return result;
    }
    
    public static void main(String...args){
        AssignCookies test = new AssignCookies();
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1,1};
        System.out.println(test.findContentChildren(g, s));
    }

}
