class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //return magazine.indexOf(ransomNote)!=-1;
        Map<Character, Integer> magMap=new HashMap<>();
        for(char c: magazine.toCharArray()){
            if(!magMap.containsKey(c)){
                magMap.put(c,1);
            }
            else{
                magMap.put(c,magMap.get(c)+1);
            }
        }
        int n=magMap.size();
        int count=0;
        for(char c: ransomNote.toCharArray()){
            if(!magMap.containsKey(c)){
                return false;
                //magMap.put(c,1)
            }
            else{
                magMap.put(c,magMap.get(c)-1);
                if(magMap.get(c)==-1) return false;
            }
        }
        return true;
    }
}