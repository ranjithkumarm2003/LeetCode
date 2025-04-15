class Solution {
    int f(int i, int buy, int arr[], int dp[][])
    {
        if(i==arr.length)
        {
            return 0;
        }
        int profit=0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy==1){
            profit= Math.max((-arr[i]+f(i+1, 0, arr, dp)), (0+f(i+1,1,arr, dp)));
        }
        else{
            profit= Math.max((arr[i]+f(i+1, 1, arr, dp)), (0+f(i+1,0,arr, dp)));
        }
        
        return dp[i][buy]= profit;

    }
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length+1][2];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return f(0,1,prices, dp);
    }
}