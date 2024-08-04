class Solution {
    public boolean isSubstringPresent(String s) {
      ArrayList<String>li=new ArrayList<>();
      ArrayList<String>al=new ArrayList<>();
      for(int i=0;i<s.length()-1;i++){
         li.add(s.substring(i,i+2));
      } 
      String str=new StringBuilder(s).reverse().toString(); 
      for(int i=0;i<str.length()-1;i++){
        al.add(str.substring(i,i+2));
      }
      int c=0;
      for(String i:li){
        if(al.contains(i)){
            c++;
        }
      }
      return c>0;
    }
}