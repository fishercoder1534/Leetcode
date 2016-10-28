package easy;

public class CompareVersionNumbers {

    public static int compareVersion(String version1, String version2) {
        String[] v1s = version1.split("\\.");//escaping it is very important! Otherwise, it's not going to work as expected!
        String[] v2s = version2.split("\\.");
        int len = (v1s.length < v2s.length) ? v2s.length : v1s.length;
        for(int i = 0; i < len; i++){
            if(v1s.length == i){
                while(i < len){
                    if(Integer.parseInt(v2s[i]) > 0) return -1;
                    i++;
                }
            } else if(v2s.length == i){
                while(i < len){
                    if(Integer.parseInt(v1s[i]) > 0) return 1;
                    i++;
                }
            } else {
                if(Integer.parseInt(v1s[i]) > Integer.parseInt(v2s[i])) return 1;
                else if(Integer.parseInt(v2s[i]) > Integer.parseInt(v1s[i])) return -1;
                else continue;//this line is not necessary, but just to make the logic more clear
            }
        }
        return 0;
    }
    
    public static void main(String...args){
//        String version1 = "1.1";
//        String version2 = "1.2";//should return -1
        
//        String version1 = "1.0.1";
//        String version2 = "1";//should return 1
        
        String version1 = "1.0";
        String version2 = "1";//should return 0
        
        /**"1.0.1", "1"*/
        System.out.println(compareVersion(version1, version2));
    }

}
