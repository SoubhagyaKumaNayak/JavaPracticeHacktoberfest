class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
    int n = prices.size();
        int profit = 0, pointer = prices[0];
        
        for(int i = 1; i < n; i++) {
            if(prices[i] < pointer) pointer = prices[i];
            
            else profit = max(profit, prices[i] - pointer);
        }
        
        return profit;
}
}
