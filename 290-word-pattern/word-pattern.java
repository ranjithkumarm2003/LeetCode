class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        String arr[]=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        int i=0;
        for(char c:pattern.toCharArray()){
            if(!map.containsKey(c) && !map.containsValue(arr[i])){
                
                map.put(c,arr[i]);
            }
            i++;
        }
        String str="";
        for(int j=0;j<pattern.length();j++){
            str+=map.get(pattern.charAt(j))+" ";
        }
        return str.trim().equals(s);
    }
}