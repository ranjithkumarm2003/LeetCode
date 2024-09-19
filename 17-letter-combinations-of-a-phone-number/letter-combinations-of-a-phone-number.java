class Solution {
    public void solve(String digits,HashMap<Character,String>dial,List<String>result,String str,int ind){
        if(str.length()==digits.length()){
            result.add(str);
            return;
        }
        else{
            String pair=dial.get(digits.charAt(ind));
            for(int i=0;i<pair.length();i++){
                solve(digits,dial,result,str+pair.charAt(i),ind+1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        String str="";
        HashMap<Character,String>dial=new HashMap<>();
        dial.put('2',"abc");
        dial.put('3',"def");
        dial.put('4',"ghi");
        dial.put('5',"jkl");
        dial.put('6',"mno");
        dial.put('7',"pqrs");
        dial.put('8',"tuv");
        dial.put('9',"wxyz");
        List<String>result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        solve(digits,dial,result,str,0);
       return result;
    }
}