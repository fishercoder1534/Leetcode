package com.stevesun.solutions;

/**Find the total area covered by two rectilinear rectangles in a 2D plane.

 Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

 Rectangle Area
 Assume that the total area is never beyond the maximum possible value of int.*/
public class RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C-A)*(D-B);
        int areaB = (G-E)*(H-F);
        
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        
        int overlap = 0;
        if(top > bottom && right > left) overlap = (top - bottom)*(right - left);
        return areaA + areaB - overlap;
    }

}
