package stevesun.algorithms;

public class BestTimeToBuyAndSellStockII {

    /**It turns out to be a super simple one, it's really a greedy one! Just keep being greedy if it's possible.*/
    public int maxProfit(int[] prices) {
        int pro = 0;
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i+1] > prices[i]) pro += prices[i+1] - prices[i];
        }
        return pro;
    }

}
