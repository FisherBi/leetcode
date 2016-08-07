package algorithms.BestTimetoBuyandSellStock;

/**
 * Created by FisherBi on 2016/8/7.
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(max < prices[i] - buy){
                max = prices[i] - buy;
            }else if(prices[i] - buy < 0){
                buy = prices[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
