class Solution {
    public int maxProfit(int[] prices) {
        int left =0;  //left = buy
        int right =1;   // right = sell
        int max_profit = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                max_profit = Math.max(max_profit, profit);
            }
            else{
                left = right;
            }
            right += 1;
        }
        return max_profit;
    }
}