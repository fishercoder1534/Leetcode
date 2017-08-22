package com.fishercoder.solutions;

import com.fishercoder.common.classes.Point;

/**
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 */
public class _149 {

    public int maxPoints(Point[] points) {
        int max = 0;
        if (points.length == 0) {
            max = 0;
        } else if (points.length == 1) {
            max = 1;
        } else if (points.length == 2) {
            max = 2;
        } else if (points.length == 3) {
            max = 2;
            if ((points[0].x - points[1].x) * (points[1].y - points[2].y) == (points[0].y - points[1].y)
                    * (points[1].x - points[2].x)) {
                max++;
            }
        } else {
            int[][] maxPoints = new int[points.length][points.length];
            for (int i = 0; i < points.length; i++) {
                for (int j = 0; j < points.length && j != i; j++) {
                    maxPoints[i][j] = 2;
                    // System.out.print(maxPoints[i][j] + " ");
                }
            }

            for (int i = 0; i < points.length; i++) {
                for (int j = 0; (j < points.length) && (j != i); j++) {
                    if (((points[i].x == points[j].x) && (points[i].y == points[j].y))) {
                        for (int k = 0; (k < points.length); k++) {
                            if ((k != i) && (k != j)) {
                                if (((points[k].x == points[i].x) && (points[k].y == points[i].y))) {
                                    maxPoints[i][j]++;
                                }
                            }
                        }
                    } else
                        for (int k = 0; (k < points.length); k++) {
                        /*
                         * Here, I must put the judgment (k!=i) && (k!=j) in the
						 * if statement instead of in the for, otherwise, when k
						 * equals i or j, it will stop traversing the rest of
						 * the points that k represents!
						 *
						 * This is the key to solving this problem and Siyuan
						 * Song helped me spot this error!
						 *
						 * It took me an hour and couldn't find any clue!
						 */
                            if ((k != i) && (k != j)) {
                                if (((points[k].x == points[i].x) && (points[k].y == points[i].y))) {
                                    maxPoints[i][j]++;
                                } else if (((points[k].x == points[j].x) && (points[k].y == points[j].y))) {
                                    maxPoints[i][j]++;
                                } else if ((points[i].x - points[j].x)
                                        * (points[k].y - points[j].y) == (points[i].y - points[j].y)
                                        * (points[k].x - points[j].x)) {
                                    maxPoints[i][j]++;

                                }
                            }
                        }
                }
            }
            for (int m = 0; m < points.length; m++) {
                for (int n = 0; n < points.length; n++) {
                    if (maxPoints[m][n] > max)
                        // System.out.print("maxPoints[" + m + "][" + n +"]:" +
                        // maxPoints[m][n] + "\t");
                        max = maxPoints[m][n];
                }
            }
        }
        return max;
    }

}
