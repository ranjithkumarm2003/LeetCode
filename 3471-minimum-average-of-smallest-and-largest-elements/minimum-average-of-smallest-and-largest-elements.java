class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int s=0,e=nums.length-1;
        double ans=(nums[s]+nums[e])/2.0;
        
        while(s<=e){
           
            ans=Math.min(ans,((nums[s]+nums[e])/2.0));
            s++;
            e--;
        }
        return ans;
    }
}