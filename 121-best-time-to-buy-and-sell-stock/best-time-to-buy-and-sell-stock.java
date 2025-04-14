class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int buyStock=prices[0];
        for(int i=1;i<n;i++){
           if(buyStock>prices[i]){
            buyStock=prices[i];
           }
            max=Math.max(max,prices[i]-buyStock);
        }
        return max;
    }
}