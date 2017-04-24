package com.stevesun.solutions;

/**
 * 475. Heaters
 *
 Winter is coming! Your first job during the contest is to design a standard heater with fixed warm radius to warm all the houses.

 Now, you are given positions of houses and heaters on a horizontal line, find out minimum radius of heaters so that all houses could be covered by those heaters.

 So, your input will be the positions of houses and heaters seperately, and your expected output will be the minimum radius standard of heaters.

 Note:
 Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
 Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
 As long as a house is in the heaters' warm radius range, it can be warmed.
 All the heaters follow your radius standard and the warm radius will the same.
 Example 1:
 Input: [1,2,3],[2]
 Output: 1
 Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
 Example 2:
 Input: [1,2,3,4],[1,4]
 Output: 1
 Explanation: The two heater was placed in the position 1 and 4. We need to use radius 2 standard, then all the houses can be warmed.
 */
public class Heaters {

	public static int findRadius(int[] houses, int[] heaters) {
		int result = 0;
		if (heaters == null || heaters.length == 0 || houses == null || houses.length == 0) return 0;
		result += heaters[0] - houses[0];
		int houseLen = houses.length;
		int heaterLen = heaters.length;
		result = Math.max(Math.abs(heaters[0] - houses[0]), result);
		result = Math.max(Math.abs(houses[houseLen-1] - heaters[heaterLen-1]), result);
		for (int i = 1; i < heaterLen; i++){
			result = Math.max( (int) ((heaters[i] - heaters[i-1])/2), result);
		}
		return result;
	}

	public static void main(String...args){
//		int[] houses = new int[]{1,2,3};
//		int[] heaters = new int[]{2};

//		int[] houses = new int[]{1,2,3,4};
//		int[] heaters = new int[]{1,4};

		int[] houses = new int[]{1};
		int[] heaters = new int[]{1,2,3,4};//should be 0
		System.out.println(findRadius(houses, heaters));
	}

}
