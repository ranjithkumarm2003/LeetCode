class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            int j=i-1;
            while( j>=0 && nums[i]==nums[j] ) j--;
             
            int k=i+1;
            while(k<=nums.length-1 && nums[i]==nums[k]) k++;

            if((j>=0 && k<=nums.length-1) && ((nums[i]>nums[j] && nums[i]>nums[k])|| (nums[i]<nums[j] && nums[i]<nums[k]))){
                 c++;
            }
        }
        return c;
    }
}