class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int buyStock=prices[0];
        for(int i=1;i<prices.length;i++){
           if(prices[i]<buyStock){
            buyStock=prices[i];
           }
           else if(prices[i]-buyStock>max){
            max=prices[i]-buyStock;
           }
            
        }
        return max;
    }
}