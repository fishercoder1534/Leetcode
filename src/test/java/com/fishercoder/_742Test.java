package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._742;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _742Test {
    private static _742.Solution1 solution1;
    private static TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _742.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2));
        System.out.println(solution1.findClosestLeaf(root, 1));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        assertEquals(1, solution1.findClosestLeaf(root, 1));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, null, null, 5, null, 6));
        TreeUtils.printBinaryTree(root);
        assertEquals(3, solution1.findClosestLeaf(root, 2));
    }

    @Test
    public void test4() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5));
        TreeUtils.printBinaryTree(root);
        assertEquals(5, solution1.findClosestLeaf(root, 5));
    }

    @Test
    public void test5() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9, null, 10, null, 11, null, 12, null, 13, null, 14, null, 15, null, 16, null, 17, null, 18, null, 19, null, 20, null, 21, null, 22, null, 23, null, 24, null, 25, null, 26, null, 27, null, 28, null, 29, null, 30, null, 31, null, 32, null, 33, null, 34, null, 35, null, 36, null, 37, null, 38, null, 39, null, 40, null, 41, null, 42, null, 43, null, 44, null, 45, null, 46, null, 47, null, 48, null, 49, null, 50, null, 51, null, 52, null, 53, null, 54, null, 55, null, 56, null, 57, null, 58, null, 59, null, 60, null, 61, null, 62, null, 63, null, 64, null, 65, null, 66, null, 67, null, 68, null, 69, null, 70, null, 71, null, 72, null, 73, null, 74, null, 75, null, 76, null, 77, null, 78, null, 79, null, 80, null, 81, null, 82, null, 83, null, 84, null, 85, null, 86, null, 87, null, 88, null, 89, null, 90, null, 91, null, 92, null, 93, null, 94, null, 95, null, 96, null, 97, null, 98, null, 99, null, 100, null, 101, null, 102, null, 103, null, 104, null, 105, null, 106, null, 107, null, 108, null, 109, null, 110, null, 111, null, 112, null, 113, null, 114, null, 115, null, 116, null, 117, null, 118, null, 119, null, 120, null, 121, null, 122, null, 123, null, 124, null, 125, null, 126, null, 127, null, 128, null, 129, null, 130, null, 131, null, 132, null, 133, null, 134, null, 135, null, 136, null, 137, null, 138, null, 139, null, 140, null, 141, null, 142, null, 143, null, 144, null, 145, null, 146, null, 147, null, 148, null, 149, null, 150, null, 151, null, 152, null, 153, null, 154, null, 155, null, 156, null, 157, null, 158, null, 159, null, 160, null, 161, null, 162, null, 163, null, 164, null, 165, null, 166, null, 167, null, 168, null, 169, null, 170, null, 171, null, 172, null, 173, null, 174, null, 175, null, 176, null, 177, null, 178, null, 179, null, 180, null, 181, null, 182, null, 183, null, 184, null, 185, null, 186, null, 187, null, 188, null, 189, null, 190, null, 191, null, 192, null, 193, null, 194, null, 195, null, 196, null, 197, null, 198, null, 199, null, 200, null, 201, null, 202, null, 203, null, 204, null, 205, null, 206, null, 207, null, 208, null, 209, null, 210, null, 211, null, 212, null, 213, null, 214, null, 215, null, 216, null, 217, null, 218, null, 219, null, 220, null, 221, null, 222, null, 223, null, 224, null, 225, null, 226, null, 227, null, 228, null, 229, null, 230, null, 231, null, 232, null, 233, null, 234, null, 235, null, 236, null, 237, null, 238, null, 239, null, 240, null, 241, null, 242, null, 243, null, 244, null, 245, null, 246, null, 247, null, 248, null, 249, null, 250, null, 251, null, 252, null, 253, null, 254, null, 255, null, 256, null, 257, null, 258, null, 259, null, 260, null, 261, null, 262, null, 263, null, 264, null, 265, null, 266, null, 267, null, 268, null, 269, null, 270, null, 271, null, 272, null, 273, null, 274, null, 275, null, 276, null, 277, null, 278, null, 279, null, 280, null, 281, null, 282, null, 283, null, 284, null, 285, null, 286, null, 287, null, 288, null, 289, null, 290, null, 291, null, 292, null, 293, null, 294, null, 295, null, 296, null, 297, null, 298, null, 299, null, 300, null, 301, null, 302, null, 303, null, 304, null, 305, null, 306, null, 307, null, 308, null, 309, null, 310, null, 311, null, 312, null, 313, null, 314, null, 315, null, 316, null, 317, null, 318, null, 319, null, 320, null, 321, null, 322, null, 323, null, 324, null, 325, null, 326, null, 327, null, 328, null, 329, null, 330, null, 331, null, 332, null, 333, null, 334, null, 335, null, 336, null, 337, null, 338, null, 339, null, 340, null, 341, null, 342, null, 343, null, 344, null, 345, null, 346, null, 347, null, 348, null, 349, null, 350, null, 351, null, 352, null, 353, null, 354, null, 355, null, 356, null, 357, null, 358, null, 359, null, 360, null, 361, null, 362, null, 363, null, 364, null, 365, null, 366, null, 367, null, 368, null, 369, null, 370, null, 371, null, 372, null, 373, null, 374, null, 375, null, 376, null, 377, null, 378, null, 379, null, 380, null, 381, null, 382, null, 383, null, 384, null, 385, null, 386, null, 387, null, 388, null, 389, null, 390, null, 391, null, 392, null, 393, null, 394, null, 395, null, 396, null, 397, null, 398, null, 399, null));
        assertEquals(399, solution1.findClosestLeaf(root, 100));
    }

}