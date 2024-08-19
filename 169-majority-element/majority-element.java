class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
            if(!hm.containsKey(num)){
                hm.put(num,1);
            }
            else{
                hm.put(num,hm.get(num)+1);
            }
        }
        for(int num:hm.keySet()){
            if(hm.get(num)>nums.length/2){
                return num;
            }
        }
        return 0;
    }
}