

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
         for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
         }
         int len=0;
         for(int num:freq.keySet()){
             if(freq.containsKey(num+1)){
                len=Math.max(len,freq.get(num)+freq.get(num+1));
             }
         }
         return len;
    }
}
