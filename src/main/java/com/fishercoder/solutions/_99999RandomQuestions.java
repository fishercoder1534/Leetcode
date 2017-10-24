package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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


    public static class RangeModule {
        /**
         * OA on 9/30/2017
         */
        List<Interval> intervals;

        public RangeModule() {
            this.intervals = new ArrayList<>();
        }

        public void addRange(int lower, int upper) {
            intervals = addRange(intervals, new Interval(lower, upper));

        }

        private List<Interval> addRange(List<Interval> intervals, Interval newInterval) {
            List<Interval> result = new ArrayList<>();
            int i = 0;
            // add all the intervals ending before newInterval starts
            while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
                result.add(intervals.get(i++));
            }
            // merge all overlapping intervals to one considering newInterval
            while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
                newInterval = new Interval( // we could mutate newInterval here also
                        Math.min(newInterval.start, intervals.get(i).start),
                        Math.max(newInterval.end, intervals.get(i).end));
                i++;
            }
            result.add(newInterval);
            // add all the rest
            while (i < intervals.size()) {
                result.add(intervals.get(i++));
            }
            return result;
        }

        public boolean queryRange(int lower, int upper) {
            /**check two ends first*/
            if (intervals.get(0).start > upper || intervals.get(intervals.size() - 1).end < lower) {
                return false;
            }

            /**Since intervals are sorted, I can use binary search for this query range to achieve log(n) (best) time complexity*/

            int left = 0;
            int right = intervals.size() - 1;
            int start;//this is the index of the interval that has overlapping with "lower"
            while (left < right) {
                int mid = left + (right - left) / 2;
                int pos = isInRange(intervals.get(mid), lower);
                if (pos == 0) {
                    start = mid;
                    if (intervals.get(start).end >= upper) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (pos < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            int pos = isInRange(intervals.get(left), lower);
            if (pos == 0) {
                if (intervals.get(left).end >= upper) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        private int isInRange(Interval interval, int lower) {
            if (interval.start <= lower && lower <= interval.end) {
                return 0;
            } else if (interval.start > lower) {
                return -1;//this means lower is on the left part of this interval
            } else {
                return 1;//this means lower is on the right part of this interval
            }
        }

        public void deleteRange(int lower, int upper) {
            /**check two ends first*/
            if (intervals.get(0).start > upper || intervals.get(intervals.size() - 1).end < lower) {
                return;
            }

            /**Since intervals are sorted, one can use binary search for this query range to achieve log(n) (best) time complexity*/
            int left = 0;
            int right = intervals.size() - 1;
            int start = Integer.MIN_VALUE;//this is the index of the interval that has overlapping with "lower"
            while (left < right) {
                int mid = left + (right - left) / 2;
                int pos = isInRange(intervals.get(mid), lower);
                if (pos == 0) {
                    start = mid;
                    break;
                } else if (pos < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (start == Integer.MIN_VALUE) {
                start = left;
            }
            Interval startInterval = intervals.get(start);
            intervals.remove(start);//remove this interval first

            if (startInterval.start < lower - 1) {
                addRange(startInterval.start, lower - 1);
            }

            if (startInterval.end > upper + 1) {
                addRange(upper + 1, startInterval.end);
            }

            if (startInterval.end < upper) {
                //only in this case, we'll have to do the following, otherwise we don't need to do anything but just return

                int end = start;//find the index of the interval that overlapping with upper
                left = start + 1;
                right = intervals.size() - 1;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    int pos = isInRange(intervals.get(mid), upper);
                    if (pos == 0) {
                        end = mid;
                        break;
                    } else if (pos < 0) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                Interval endInterval = intervals.get(end);//retrieve this interval first before removing the others

                //remove all of the ranges up to end
                for (int i = start + 1; i <= end; i++) {
                    intervals.remove(i);
                }

                addRange(upper + 1, endInterval.end);
            }

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
