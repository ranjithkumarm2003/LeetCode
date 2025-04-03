class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s="";
        for(int i=0;i<paragraph.length();i++){
            if(paragraph.charAt(i)>='A' && paragraph.charAt(i)<='Z'){
               s+=(char)(paragraph.charAt(i)+32);
            }
            else{
                s+=paragraph.charAt(i);
            }
        }
        String str[]=s.split("[!?',;. ]+");
        HashMap<String,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        int max=-1;
        for(String st:str){
            if(isBanned(st,banned)) continue;
            if(map.containsKey(st)){
               map.put(st,map.get(st)+1);
            }
            else{
                map.put(st,1);
            }
           if(map.get(st)>max){
            max=map.get(st);
            sb.setLength(0);
            sb.append(st);
           }

        }
      return sb.toString();
       
    }
    public boolean isBanned(String st, String[]ban){
        for(String s:ban){
            if(s.equals(st)) return true;
        }
        return false;
    }

}