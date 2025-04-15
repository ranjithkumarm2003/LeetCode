class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        for(int i=prices.length-1;i>0;i--){
            prices[i]=prices[i]-prices[i-1];
        }
        for(int i=1;i<prices.length;i++){
            if(prices[i]>0){
                pro+=prices[i];
            }
        }
        return pro;
    }
}