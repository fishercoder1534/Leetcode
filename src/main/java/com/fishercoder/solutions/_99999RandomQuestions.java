package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class _99999RandomQuestions {

    public static void main(String... args) {
//        int[] nums = new int[]{1, 2, 3, 4, 5, -1, -3, -6, 3, 2, -4};
//        int[] nums = new int[]{-1, -2, 1,2,3};
//        int[] nums = new int[]{-1, -2, 1,2,3,-1, -2};
//        List<int[]> result = subarraySum_v2(nums);

//        System.out.println(rollingString("abc", new String[]{"0 0 L", "2 2 L", "0 2 R"}));
//
//        GetMovies getMovies = new GetMovies();
//        System.out.println(getMovies.getMovieTitles("spiderman"));
//
//        System.out.println(counting("00110"));

//        int total = 0;
//        for (int n = 0; n < 50; n++) {
//            if (method(n)) {
//                total++;
//                System.out.print(n + ", " + method(n) + "\n");
//            }
//        }
//        System.out.println("total = " + total);

//        System.out.println(getShiftedString("abcd", 1, 2));
//        System.out.println(getShiftedString("abcd", 1, 0));

        //List<Integer> result = cellCompete(new int[]{1, 0, 0, 0, 0, 1, 0, 0}, 1);
        //List<Integer> result = cellCompete(new int[]{1, 1, 1, 0, 1, 1, 1, 1}, 2);
        //CommonUtils.printList(result);

        //System.out.println(generalizedGCD(5, new int[] {2, 4, 6, 8, 10}));


        //List<List<Integer>> allLocations = new ArrayList<>();
        //allLocations.add(List.of(1, 2));
        //allLocations.add(List.of(3, 4));
        //allLocations.add(List.of(1, -1));
        //allLocations.add(List.of(-1, 1));
        //List<List<Integer>> result = nearestVegetarianRestaurant(3, allLocations, 2);
        //CommonUtils.printListList(result);

        //List<List<Integer>> foregroundAppList = new ArrayList<>();
        //foregroundAppList.add(List.of(1, 2));
        //foregroundAppList.add(List.of(2, 4));
        //foregroundAppList.add(List.of(3, 6));
        //List<List<Integer>> backgroundAppList = new ArrayList<>();
        //backgroundAppList.add(List.of(1, 2));
        //List<List<Integer>> result = optimalUtilization(7, foregroundAppList, backgroundAppList);
        //CommonUtils.printListList(result);

        //List<List<Integer>> foregroundAppList = new ArrayList<>();
        //foregroundAppList.add(List.of(1, 3));
        //foregroundAppList.add(List.of(2, 5));
        //foregroundAppList.add(List.of(3, 7));
        //foregroundAppList.add(List.of(4, 10));
        //List<List<Integer>> backgroundAppList = new ArrayList<>();
        //backgroundAppList.add(List.of(1, 2));
        //backgroundAppList.add(List.of(2, 3));
        //backgroundAppList.add(List.of(3, 4));
        //backgroundAppList.add(List.of(4, 5));
        //List<List<Integer>> result = optimalUtilization(10, foregroundAppList, backgroundAppList);
        //CommonUtils.printListList(result);

        int[][] image = {
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 0, 1},
            {1, 1, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1}
        };

        int[][] image2 = {
            {0, 0, 0, 1},
            {0, 0, 0, 1},
            {1, 1, 1, 1}
        };
        //should return 0,0 1,2

        int[][] image3 = {
            {1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0}
        };//should return 0,3 1,6

        int[][] image4 = {{0}};

        //this is for follow up question, see description below
        int[][] image5 = {
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 1, 1},
            {1, 1, 1, 0, 0, 1, 1},
            {1, 1, 1, 1, 1, 1, 1},
        };
        //should return
        // [[[2,3],[3,5]],
        //  [[3,1],[5,1]],
        //  [[5,3],[6,4]]]

//        int[][] result = findEdges(image4);
//        System.out.println("here");
//        for (int[] list : result) {
//            for (int num : list) {
//                System.out.println(num);
//            }
//        }

        System.out.println(isValidString("aabbcd"));//should be false
        System.out.println(isValidString("abc"));//should be true
        System.out.println(isValidString("aabbbbc"));//should be false
        System.out.println("ended");
    }

    /**
     Consider a string to be valid if all characters of the string appear the same number of times.
     It is also valid if he can remove just a character at any one index in the string,
     and the remaining characters will occur the same number of times. Given a string ,
     determine if it is valid. If so, return YES, otherwise return NO.

    For example,

    1. abc, is a valid string because frequencies of a, b, c are 1 .
    2. aabc, is a valid string because you can remove an occurance of a and then frequencies of a, b, c would be 1.
    3. aaabc, is not a valid string because you remove maximumn one occurance of a, and the frequencies of b and c would be 1, where as a it is 2
*/

    public static boolean isValidString(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        Map<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int times = map.get(c);
                map.put(c, times + 1);
            } else {
                map.put(c, 1);
            }
        }
        //a-1, b-1, c-1
        //a-2, b-4, c-1
        //a-1, b-1, c-2
        //a-2, b-2, c-1, d -1
        // times1 2
        // times2 0
        int times1 = 0;//Integer.MIN_VALUE;
        int times2 = 0;
        for (Character key : map.keySet()) {
            times1 = map.get(key);
            break;
        }
        int diff = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) != times1 && times2 == 0) {
                times2 = map.get(key);
                diff++;
                continue;
            }
            if (map.get(key) != times2 && map.get(key) != times1) {
                return false;
            }
        }
        return (Math.abs(times1 - times2) == 1) && diff < 2;
    }

    /**
     * Imagine we have an image. We'll represent this image as a simple 2D array where every pixel is a 1 or a 0.
     * The image you get is known to have a single rectangle of 0s on a background of 1s.
     * Write a function that takes in the image and returns the coordinates of the rectangle of 0's --
     * either top-left and bottom-right; or top-left, width, and height.
     *
     * Sample output:
     * x: 3, y: 2, width: 3, height: 2
     * 2,3 3,5 -- row,column of the top-left and bottom-right corners
     * 3,2 5,3 -- x,y of the top-left and bottom-right corners (as long as you stay consistent, either format is fine)
     *
     * Follow up:
     * What if there could be multiple such rectangles in there? How do you design an algorithm to return all of them?
     * What's the time and space complexity of your algorithm?
     * E.g. see image5 above*/
    static int[][] findEdges(int[][] image) {
        int[][] result = new int[2][2];
        result[0][0] = -1;
        result[0][1] = -1;
        result[1][0] = -1;
        result[1][1] = -1;
        if (image == null || image.length == 0) {
            return result;
        }
        int m = image.length;
        int n = image[0].length;
        System.out.println(" m = " + m + " n = " + n);
        int i = 0;
        int j = 0;
        for (i = 0; i < m; i++) {
            System.out.println("In first for loop: i = " + i + " j = " + j);
            for (j = 0; j < n; j++) {
                System.out.println("In second for loop: i = " + i + " j = " + j);
                if (image[i][j] == 0) {
                    System.out.println(" i = " + i + " j = " + j);
                    result[0][0] = i;
                    result[0][1] = j;
                    break;
                }
            }
            if (result[0][0] != -1) {
                break;
            }
        }

        while (i < m && image[i][j] == 0) {
            i++;
        }

        System.out.println("i = " + i);
        i--;
        while (j < n && image[i][j] == 0) {
            j++;
        }

        result[1][0] = i;
        result[1][1] = --j;
        return result;
    }



    /**An engineer works on a system that divides application to a mixed cluster of computing devices. Each application is identified by an Integer ID, requires
     * a fixed non-zero amount of memory to execute, and is defined to be either a foreground or background application. IDs are guaranteed to be unique within their own application type, but not across types.
     *
     * Each device should be assigned two applications at once, one foreground application and one background application. Devices have limited amounts of memory and cannot execute applications that require more memory
     * than the available memory. The goal of the system is to maximize the total utilization of the memory of a given device.
     * A foreground/background application pair is considered to be optimal if there does not exist another pair that uses more memory than this pair, and also has a total less than or equal to the total memory of the device.
     * For example, if the device has a total of 10MB memory, a foreground/background pair using a sum total of 9MB memory would be optimal if there does not exist a pair that uses a sum total of 10 MB, but would not
     * be optimal if such a pair did exist.
     *
     * Write an algorithm to help this engineer find the sets of foreground/background app pairs that optimally utilize the given device for a given list of foreground applications and a given list of background applications.
     *
     * Example 1:
     * deviceCapacity: 7
     * foregroundAppList: [[1,2], [2,4],[3,6]]
     * backgroundAppList: [[1,2]]
     *
     * Output:
     * [[2,1]]
     *
     * Explanation:
     * There are only three combinations: [1,1,][2,1] and [3,1], which use of a total of 4, 6 and 8 MB of memory, since 6 is the largest use that does not exceed 7, [2,1] becomes the only optimal pair.*/
    static List<List<Integer>> optimalUtilization(int deviceCapacity,
        List<List<Integer>> foregroundAppList, List<List<Integer>> backgroundAppList) {
        TreeMap<Integer, List<List<Integer>>> memorySumToAppMap =
            new TreeMap<>(Collections.reverseOrder());
        for (List<Integer> foregroundApp : foregroundAppList) {
            for (List<Integer> backgroundApp : backgroundAppList) {
                int memorySum = foregroundApp.get(1) + backgroundApp.get(1);
                if (!memorySumToAppMap.containsKey(memorySum)) {
                    memorySumToAppMap.put(memorySum, new ArrayList<>());
                }
                List<Integer> appPair = new ArrayList<>();
                appPair.add(foregroundApp.get(0));
                appPair.add(backgroundApp.get(0));
                memorySumToAppMap.get(memorySum).add(appPair);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int memorySum : memorySumToAppMap.keySet()) {
            if (memorySum > deviceCapacity) {
                continue;
            } else {
                result = memorySumToAppMap.get(memorySum);
                break;
            }
        }
        return result;
    }

    /**Build a robot to help return nearest X restaurants given an array representing the locations of N vegetarian restaurants.
     *
     * Note:
     * The customer begins at location: [0, 0]
     * numRestaurants < totalRestaurants
     * the distance from the customer's current location to a recommended veg restaurant location(x, y) is the sqare root of x2 + y2.
     * If there are ties, then return any of the locations as long as you satisfy returning X nearby veg restaurants.
     * */
    static List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants,
        List<List<Integer>> allLocations, int numRestaurants) {
        TreeMap<Double, List<List<Integer>>> treeMap = new TreeMap<>();
        for (List<Integer> location : allLocations) {
            double distance =
                Math.sqrt(Math.pow(location.get(0), 2) + Math.pow(location.get(1), 2));
            if (!treeMap.containsKey(distance)) {
                treeMap.put(distance, new ArrayList<>());
            }
            treeMap.get(distance).add(location);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Double distance : treeMap.keySet()) {
            if (numRestaurants > 0) {
                List<List<Integer>> locations = treeMap.get(distance);
                for (List<Integer> location : locations) {
                    if (numRestaurants <= 0) {
                        break;
                    } else {
                        result.add(location);
                        numRestaurants--;
                    }
                }
            } else {
                break;
            }
        }
        return result;
    }


    static int generalizedGCD(int num, int[] arr) {
        int gCD = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            gCD = Math.max(gCD, getGCD(arr[i], arr[i + 1]));
        }
        return gCD;
    }

    private static int getGCD(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        return getGCD(b, a % b);
    }

    public static List<Integer> cellCompete(int[] states, int days) {
        List<Integer> result = new ArrayList<>(states.length);
        for (int i = 0; i < states.length; i++) {
            result.add(0);
        }
        while (days-- > 0) {
            for (int i = 0; i < states.length; i++) {
                if (i == 0) {
                    if (states[i + 1] == 0) {
                        result.set(i, 0);
                    } else {
                        result.set(i, 1);
                    }
                } else if (i == states.length - 1) {
                    if (states[i - 1] == 0) {
                        result.set(i, 0);
                    } else {
                        result.set(i, 1);
                    }
                } else {
                    if ((states[i - 1] == 0 && states[i + 1] == 1) || (states[i - 1] == 1
                        && states[i + 1] == 0)) {
                        result.set(i, 1);
                    } else if ((states[i - 1] == 0 && states[i + 1] == 0) || (states[i - 1] == 1
                        && states[i + 1] == 1)) {
                        result.set(i, 0);
                    }
                }
            }

            for (int i = 0; i < states.length; i++) {
                states[i] = result.get(i);
            }
        }
        return result;
    }

    /**
     * This below small code snippet checks whether a given number is a prime number or not
     */
    static boolean method(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
//                System.out.print("n = " + n + ", " + "i = " + i + "\t");
                return false;
            }
        }
        return true;
    }


    /**
     * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
     * 1. one left parenthesis must have a corresponding right parenthesis
     * 2. left parenthesis must go before the corresponding right parenthesis
     * 3. '*' could bind with a right parenthesis and be treated as a single right parenthesis or '*' could dissolve this right parenthesis and be treated as an empty string.
     * <p>
     * Examples below:
     * "()" -> true ,
     * "(*)" -> true ,
     * "(*))" -> true,
     * ")(", -> false
     * "(*()" -> false
     * "((*)" -> false
     * "((*)))" -> true
     * "()()" -> true
     * "(((())))" -> true
     * "(((******)))" -> true
     * "(((******))" -> false
     * "((*)****)" -> true
     */
    public boolean isValid(String input) {
        return rec(input, 0, 0);
    }

    private boolean rec(String input, int start, int leftParen) {
        if (start == input.length()) {
            return leftParen == 0;
        }
        if (input.charAt(start) == '(') {
            return rec(input, start + 1, leftParen + 1);
        } else if (input.charAt(start) == '*') {
            if (start + 1 < input.length() && input.charAt(start + 1) == '*') {
                return rec(input, start + 1, leftParen);
            } else if (start + 1 < input.length() && input.charAt(start + 1) == ')') {
                return rec(input, start + 2, leftParen - 1) || rec(input, start + 2, leftParen);
            }
        } else if (input.charAt(start) == ')') {
            if (leftParen <= 0) {
                return false;
            }
            return rec(input, start + 1, leftParen - 1);
        }
        return false;
    }

    static String rollingString(String s, String[] operations) {
        char[] chars = s.toCharArray();
        for (String operation : operations) {
            String[] ops = operation.split(" ");
            for (int i = Integer.parseInt(ops[0]); i <= Integer.parseInt(ops[1]); i++) {
                if ("L".equals(ops[2])) {
                    if (chars[i] == 'a') {
                        chars[i] = 'z';
                    } else {
                        chars[i] -= 1;
                    }
                } else if ("R".equals(ops[2])) {
                    if (chars[i] == 'z') {
                        chars[i] = 'a';
                    } else {
                        chars[i] += 1;
                    }
                }
            }
        }
        return new String(chars);
    }

    public static class GetMovies {
        static String[] getMovieTitles(String substr) {
            final String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
            List<String> movies = new ArrayList<>();
            try {
                String response = getResponse(url + substr);
                JsonParser parser = new JsonParser();
                JsonElement rootNode = parser.parse(response);

                JsonObject details = rootNode.getAsJsonObject();

                JsonElement totalMovies = details.get("total");
                System.out.println(totalMovies.toString());

                JsonElement totalPages = details.get("total_pages");
                System.out.println(totalPages.toString());

                int currentPage = 0;
                while (currentPage++ < Integer.parseInt(totalPages.toString())) {
                    nextPage(movies, currentPage, substr);
                }
                Collections.sort(movies);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String[] result = new String[movies.size()];
            return movies.toArray(result);
        }

        static void nextPage(List<String> movies, int currentPage, String substr) throws Exception {
            final String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
            String response = getResponse(url + substr + "&page=" + currentPage);
            JsonParser parser = new JsonParser();
            JsonElement rootNode = parser.parse(response);

            JsonObject details = rootNode.getAsJsonObject();
            JsonElement data = details.get("data");
            JsonArray jsonArray = data.getAsJsonArray();
            for (JsonElement each : jsonArray) {
                JsonObject titleObject = each.getAsJsonObject();
                String title = titleObject.get("Title").getAsString();
                movies.add(title);
            }
        }

        static String getResponse(String urlToRead) throws Exception {
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
            return result.toString();
        }
    }

    public static class SubArraySum {
        /**
         * Given an array, return the start/end indices of the contiguous subarray that have the largest sum.
         * Note:
         * 1. There could be multiple subarrays, return all of the indices.
         */
        public static List<int[]> subarraySum(int[] nums) {
            int[] preSums = new int[nums.length + 1];
            for (int i = 1; i <= nums.length; i++) {
                preSums[i] = preSums[i - 1] + nums[i - 1];
            }
            TreeMap<Integer, List<int[]>> preSum = new TreeMap(Collections.reverseOrder());
            for (int i = 1; i <= nums.length; i++) {
                for (int j = 0; j < i - 1; j++) {
                    int sum = preSums[i] - preSums[j];
                    if (!preSum.containsKey(sum)) {
                        List<int[]> value = new ArrayList<>();
                        value.add(new int[]{j, i - 1});
                        preSum.put(sum, value);
                    } else {
                        List<int[]> value = preSum.get(sum);
                        value.add(new int[]{j, i - 1});
                        preSum.put(sum, value);
                    }
                }
            }
            Map.Entry<Integer, List<int[]>> firstEntry = preSum.firstEntry();
            return firstEntry.getValue();
        }
    }

    public static class LongestRepeatedSubstring {
        public String findLongestRepeatedSubstring(String s) {
            if (s == null || s.length() == 0) {
                return s;
            }
            for (int end = s.length() - 1; end > 0; end--) {
                String candidate = s.substring(0, end);
                for (int start = 1; start <= s.length() - candidate.length(); start++) {
                    if (candidate.equals(s.substring(start, start + candidate.length()))) {
                        return candidate;
                    }
                }
            }
            return s.substring(0, 1);
        }
    }

    public static String getShiftedString(String s, int left, int right) {
        if (left == right) {
            return s;
        } else if (left > right) {
            return shiftLeft(s, left - right);
        } else {
            return shiftRight(s, right - left);
        }
    }

    private static String shiftRight(String s, int pos) {
        pos %= s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - pos; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        int i = 0;
        while (i < s.length() - pos) {
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }

    private static String shiftLeft(String s, int pos) {
        pos %= s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = pos; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        int i = 0;
        while (i < pos) {
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }

}
