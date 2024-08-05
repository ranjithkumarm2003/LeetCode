class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int max=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int a=Ldigit(nums[i]);
                int b=Ldigit(nums[j]);
            
            if(a==b){
                max=Math.max(nums[i]+nums[j],max);
            }
            }
        }
            return max;
        
    }
    

    public int Ldigit(int num) {
        int max = 0;
        while (num != 0) {
            int rem = num % 10;
            max = Math.max(rem, max);
            num /= 10;
        }
        return max;
    }
}