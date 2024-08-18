class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int res=solve(nums,n,dp);
        return res;
    }
    public int solve(int nums[],int i,int dp[]){
        if(i<=0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        else{
            int n1=nums[i-1]+solve(nums,i-2,dp);
            int n2=solve(nums,i-1,dp);
            dp[i]= Math.max(n1,n2);
            return dp[i];
        }
        
    }
}