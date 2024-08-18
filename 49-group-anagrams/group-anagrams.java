class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
       /* if(strs[0].equals("")){
            List<String>al=new ArrayList<>();
            al.add("");
            res.add(new ArrayList<>(al));
        }*/
        ArrayList<String>copy=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            copy.add(strs[i]);
        }
        for(int i=0;i<strs.length;i++){
            char sa[]=strs[i].toCharArray();
            Arrays.sort(sa);
            String st=new String("");
             for(int j=0;j<sa.length;j++){
                String ch=Character.toString(sa[j]);
                st=st+ch;
             }
             strs[i]=st;
        }
        
        
        for(int i=0;i<strs.length;i++){
            List<String>li=new ArrayList<>();
            for(int j=0;j<strs.length;j++){
                if((i==j)&& !strs[i].equals("*") && !strs[j].equals("*")){
                   li.add(copy.get(i));
                }
                 
               else if(strs[i].equals(strs[j]) && !strs[i].equals("*") && !strs[j].equals("*")){
                   li.add(copy.get(j));
                   strs[j]="*";
                }
            }
            strs[i]="*";
            if(li.size()!=0){
            res.add(new ArrayList<>(li));
            }

        }
      return res;
    }
}