package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 800. Similar RGB Color

 In the following, every capital letter represents some hexadecimal digit from 0 to f.

 The red-green-blue color "#AABBCC" can be written as "#ABC" in shorthand.  For example, "#15c" is shorthand for the color "#1155cc".

 Now, say the similarity between two colors "#ABCDEF" and "#UVWXYZ" is -(AB - UV)^2 - (CD - WX)^2 - (EF - YZ)^2.

 Given the color "#ABCDEF", return a 7 character color that is most similar to #ABCDEF, and has a shorthand (that is, it can be represented as some "#XYZ"

 Example 1:
 Input: color = "#09f166"
 Output: "#11ee66"
 Explanation:
 The similarity is -(0x09 - 0x11)^2 -(0xf1 - 0xee)^2 - (0x66 - 0x66)^2 = -64 -9 -0 = -73.
 This is the highest among any shorthand color.

 Note:

 color is a string of length 7.
 color is a valid RGB color: for i > 0, color[i] is a hexadecimal digit from 0 to f
 Any answer which has the same (highest) similarity as the best answer will be accepted.
 All inputs and outputs should use lowercase letters, and the output is 7 characters.

 */
public class _800 {
  public static class Solution1 {
    public String similarRGB(String color) {
      List<String> allShortHandCombinations = computeAllShorthandCombinations();
      int minSimilarity = Integer.MIN_VALUE;
      String result = "";
      for (String candidate : allShortHandCombinations) {
        int similarity = computeSimilarity(candidate, color);
        if (similarity > minSimilarity) {
          result = candidate;
          minSimilarity = similarity;
        }
      }
      return result;
    }

    private int computeSimilarity(String candidate, String color) {
      return -(Integer.parseInt(candidate.substring(1, 3), 16) - Integer.parseInt(
          color.substring(1, 3), 16)) * (Integer.parseInt(candidate.substring(1, 3), 16)
          - Integer.parseInt(color.substring(1, 3), 16))
          - (Integer.parseInt(candidate.substring(3, 5), 16) - Integer.parseInt(
          color.substring(3, 5), 16)) * (Integer.parseInt(candidate.substring(3, 5), 16)
          - Integer.parseInt(color.substring(3, 5), 16))
          - (Integer.parseInt(candidate.substring(5, 7), 16) - Integer.parseInt(
          color.substring(5, 7), 16)) * (Integer.parseInt(candidate.substring(5, 7), 16)
          - Integer.parseInt(color.substring(5, 7), 16));
    }

    private List<String> computeAllShorthandCombinations() {
      List<String> result = new ArrayList<>();
      List<Character> hexNumber = new ArrayList<>(
          Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
              'f'));
      for (int i = 0; i < hexNumber.size(); i++) {
        for (int j = 0; j < hexNumber.size(); j++) {
          for (int k = 0; k < hexNumber.size(); k++) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(hexNumber.get(i));
            sb.append(hexNumber.get(i));
            sb.append(hexNumber.get(j));
            sb.append(hexNumber.get(j));
            sb.append(hexNumber.get(k));
            sb.append(hexNumber.get(k));
            result.add(sb.toString());
          }
        }
      }
      return result;
    }
  }
}
