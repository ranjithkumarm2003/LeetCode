class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int bs=prices[0];
        for(int i=1;i<prices.length;i++){
            if(bs>prices[i]){
                bs=prices[i];
            }
            else if(prices[i]-bs>max){
                max=prices[i]-bs;
            }
        }
      return max;
    }
}




















//    int max = 0;
//         int buyStock=prices[0];
//         for(int i=1;i<prices.length;i++){
//            if(prices[i]<buyStock){
//             buyStock=prices[i];
//            }
//            else if(prices[i]-buyStock>max){
//             max=prices[i]-buyStock;
//            }
            
//         }
//         return max;