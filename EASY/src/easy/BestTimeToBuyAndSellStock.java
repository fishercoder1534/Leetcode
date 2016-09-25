package easy;

/**121. Best Time to Buy and Sell Stock  QuestionEditorial Solution  My Submissions
Total Accepted: 117685
Total Submissions: 318311
Difficulty: Easy
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.*/
public class BestTimeToBuyAndSellStock {
/**The key here is that you'll have to buy first, before you can sell.
 * That means, if the lower price comes after a higher price, their combination won't work! Since you cannot sell first
 * before you buy it.*/
    public int maxProfit(int[] prices) {
        //use current price to deduct the previous min to get current profit, and then take the max from previousMax and this newly calculated max
        if(prices == null || prices.length < 2) return 0;
        int min = prices[0], prevProf = 0, currPro = 0;
        for(int i = 1; i < prices.length; i++){
            currPro = Math.max(prices[i] - min, prevProf);
            min = Math.min(min, prices[i]);
            prevProf = currPro;
        }
        return currPro;
    }
    
    public static void main(String...strings){
//        int[] prices = new int[]{7,1,5,3,6,4};
//        int[] prices = new int[]{7,6,4,3,1};
//        int[] prices = new int[]{2,4,1};
        int[] prices = new int[]{1,2};
        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        System.out.println(test.maxProfit(prices));
    }
    

    /**Pretty straightforward, sell before you buy, keep a global maxProfit variable, update it along the way if necessary.*/
    public int maxProfit_20160924(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length < 2) return 0;
        int minBuy = prices[0];
        int maxSell = prices[1];
        int maxProfit = (maxSell - minBuy) > 0 ? (maxSell - minBuy) : 0;
        for(int i = 1; i < prices.length; i++){
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }
        return maxProfit;
    }
}
