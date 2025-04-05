class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double ans[]=new double[n/2];
        int i=0,j=n-1;
        int max=0;
        int min=51;
        int min_ind=-1;
        int max_ind=-1;
        int k=0;
        while(true){
           
            if(nums[i]<nums[j]){
                if(nums[i]==0 && i<j){
                i++;
                continue;
            }
                if(nums[i]<min && nums[i]!=0 ){
                    min=nums[i];
                    min_ind=i;
                }
            }
            else{
                if(nums[j]<min && nums[j]!=0){
                    min=nums[j];
                    min_ind=j;
                }
            }
            if(nums[i]>nums[j] ){
                 if(nums[j]==0 && j>i){
                j--;
                continue;
            }
                if(nums[i]>max){
                    max=nums[i];
                    max_ind=i;
                }
            }
            else{
                if(nums[j]>max && nums[j]!=0){
                    max=nums[j];
                    max_ind=j;
                }
            }
            if(i<=j) i++;
               
           if(j>=i) j--;
            
            
            if(i>j){
                  i=0;
                  j=n-1;
                  nums[min_ind]=0;
                  nums[max_ind]=0;
                  ans[k++]=(double)(min+max)/2;
                  min=51;
                  max=0;
                  if(k==n/2) break;
            }
           

        }
        Arrays.sort(ans);
        return ans[0];

    }
}