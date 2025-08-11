class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        //StringTokenizer st=new StringTokenizer<>(s, " ");
        String str[]=s.split(" ");
        int k=0;
        if(pattern.length()!=str.length) return false;
        for(char c: pattern.toCharArray()){
            if(!map.containsKey(c)){
                if(!map.containsValue(str[k]))
                map.put(c,str[k]);
                else 
                return false;
            }
            else if(map.containsKey(c) && !map.get(c).equals(str[k])){
                return false;
            }
            k++;
        }
        return true;
    }
}