class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> li=new ArrayList<>();
      
      for(int i=0;i<words.size();i++){
        String a=words.get(i);
        String s="";
        int ind=0;
          for(int j=0;j<a.length();j++){
              char ch=a.charAt(j);
            if(ch==separator){
                if(a.substring(ind,j).length()!=0){
                      s=s+a.substring(ind,j);
                      li.add(s);
                      ind=j+1;
                      s="";

                }
                else{
                    ind=j+1;
                }
                continue;
            }
            if(j==a.length()-1 && a.substring(ind,j+1).length()!=0){
                    s=s+a.substring(ind,a.length());
                    li.add(s);
                    s="";
                }

            
          }
      } 
      return li;
    }
}