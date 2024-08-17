class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        
        String strnums[]=new String [n];
        for(int i=0;i<nums.length;i++){
            strnums[i]=String.valueOf(nums[i]);  
        }
        Arrays.sort(strnums,new Comparator<String>(){
            public int compare(String a,String b){
                String order1=a+b;
                String order2=b+a;
                return order2.compareTo(order1);
            }
        });
        if(strnums[0].equals("0"))return "0";
        StringBuilder sb=new StringBuilder();
        for(String i:strnums){
            sb.append(i);
        }
        return sb.toString();
    }
}