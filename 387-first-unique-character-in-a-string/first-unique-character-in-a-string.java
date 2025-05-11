class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            }
            else{
                mp.put(c,1);
            }
        }
        for(char c:mp.keySet()){
            System.out.println(c);
            if(mp.get(c)==1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}