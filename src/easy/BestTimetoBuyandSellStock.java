package easy;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int lowest = prices[0] ;
        int profit = 0;

        for (int i = 1; i < prices.length; i++){
            if(prices[i] < lowest) {
                lowest = prices[i];
            } else if (prices[i] - lowest > profit) {
                profit = prices[i] - lowest;
            }
        }

        return profit;
    }
}
