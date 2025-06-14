class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int tc=n;
        if(nums[0]==nums[n-1]) return 2;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) return i+1;
            int c=1;
            int j=i;
            while(j<n-1 && nums[j]==nums[j+1]  ){
                c++;
                if(j+1==n-1 && c>2) return tc-c+2;
                j++;
            }
            while(c>2){
                int dup=nums[i];
            for(int l=i+1;l<n;l++){
                nums[l-1]=nums[l];
            }
              nums[n-1]=dup;
              c--;
              tc--;
            }
        }
       return tc;
    }
}