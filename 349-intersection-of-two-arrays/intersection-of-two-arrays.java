class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            int c=0;

            for(int j=0;j<nums2.length;j++){
                  if(nums1[i]==nums2[j]){
                    c++;
                  }
            }
            if(c>0){
                set.add(nums1[i]);
                continue;
            }
           
        }
       int arr[]=new int [set.size()];
       int k=0;
       for(int i:set){
        arr[k++]=i;
       }
       return arr;
    }
}