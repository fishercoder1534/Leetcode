package com.fishercoder.solutions;

/**
 * 302. Smallest Rectangle Enclosing Black Pixels
 *
 * An image is represented by a binary matrix with 0 as a white pixel and 1 as a black pixel.
 * The black pixels are connected, i.e., there is only one black region.
 * Pixels are connected horizontally and vertically.
 * Given the location (x, y) of one of the black pixels, return the area of the smallest (axis-aligned) rectangle that encloses all black pixels.

 For example, given the following image:

 [
 "0010",
 "0110",
 "0100"
 ]
 and x = 0, y = 2,
 Return 6.
 */
public class _302 {
    public static class Solution1 {
        private char[][] image;

        public int minArea(char[][] iImage, int x, int y) {
            image = iImage;
            int m = image.length;
            int n = image[0].length;
            int left = searchColumns(0, y, 0, m, true);
            int right = searchColumns(y + 1, n, 0, m, false);
            int top = searchRows(0, x, left, right, true);
            int bottom = searchRows(x + 1, m, left, right, false);
            return (right - left) * (bottom - top);
        }

        private int searchColumns(int i, int j, int top, int bottom, boolean opt) {
            while (i != j) {
                int k = top;
                int mid = (i + j) / 2;
                while (k < bottom && image[k][mid] == '0') {
                    ++k;
                }
                if (k < bottom == opt) {
                    j = mid;
                } else {
                    i = mid + 1;
                }
            }
            return i;
        }

        private int searchRows(int i, int j, int left, int right, boolean opt) {
            while (i != j) {
                int k = left;
                int mid = (i + j) / 2;
                while (k < right && image[mid][k] == '0') {
                    ++k;
                }
                if (k < right == opt) {
                    j = mid;
                } else {
                    i = mid + 1;
                }
            }
            return i;
        }
    }
}
