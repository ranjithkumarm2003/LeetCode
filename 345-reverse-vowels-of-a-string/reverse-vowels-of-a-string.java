class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        String vow="aeiouAEIOU";
        while(i<j){
            if(vow.indexOf(""+arr[i])==-1){
                i++;
            }
            if(vow.indexOf(""+arr[j])==-1){
                j--;
            }
            if((vow.indexOf(""+arr[i])!=-1) && (vow.indexOf(""+arr[j])!=-1)){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }

        return String.copyValueOf(arr);
    }
}