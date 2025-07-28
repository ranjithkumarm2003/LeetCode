class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            int j=i-1;
            
            while(nums[i]==nums[j]){
                j--;
                if(j<0){
                  
                    break;
                }
            }
            int k=i+1;
            while(nums[i]==nums[k]){
                k++;
                if(k>nums.length-1){
                   
                    break;
                }
            }
            if((j>=0 && k<=nums.length-1) && ((nums[i]>nums[j] && nums[i]>nums[k])|| (nums[i]<nums[j] && nums[i]<nums[k]))){
                 c++;
            }
        }
        return c;
    }
}