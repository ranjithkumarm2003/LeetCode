class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("\\-+");
        String str="";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                int m=Integer.parseInt(arr[i]);
             str+=Integer.toBinaryString(m);
             break;
            }
            int n=Integer.parseInt(arr[i]);
             str+=Integer.toBinaryString(n);
             str+="-";
            
        }
        return str;
    }
}