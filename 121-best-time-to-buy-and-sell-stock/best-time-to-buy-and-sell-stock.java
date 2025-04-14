class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int buyStock=prices[0];
        for(int i=1;i<n;i++){
           if(buyStock>prices[i]){
            buyStock=prices[i];
           }
            max=(prices[i]-buyStock>max)?prices[i]-buyStock:max;
        }
        return max;
    }
}