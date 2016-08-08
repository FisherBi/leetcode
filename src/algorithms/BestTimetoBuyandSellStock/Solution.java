package algorithms.BestTimetoBuyandSellStock;

/**
 * Created by FisherBi on 2016/8/7.
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        int min = 0;
        int maxDiff = 0;
        int buy = 0;
        int sell = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[min]){
                min = i;
            }
            int diff = prices[i] - prices[min];
            if(diff > maxDiff){
                buy = min;
                sell = i;
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
