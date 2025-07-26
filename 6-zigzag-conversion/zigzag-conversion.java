class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        String ans[]=new String[numRows];
        //Arrays.fill(ans,"");
        for(int i=0;i<ans.length;i++){
            ans[i]="";
        }
        int k=0;int l=1;
        for(int i=0;i<s.length();i++){
            ans[k]+=s.charAt(i);
            if(k==0){
                l=1;
            }
            else if(k==numRows-1){
                l=-1;
            }
            k+=l;
        }
        String res="";
        for(int i=0;i<numRows;i++){
            if(ans[i]!=null)
              res+=ans[i];
        }
        return res;
    }
}


// class Solution {
//     public String convert(String s, int numRows) {
//        if (numRows == 1 || numRows >= s.length()) {
//             return s;
//         }

//         int idx = 0, d = 1;
//         List<Character>[] rows = new ArrayList[numRows];
//         for (int i = 0; i < numRows; i++) {
//             rows[i] = new ArrayList<>();
//         }

//         for (char c : s.toCharArray()) {
//             rows[idx].add(c);
//             if (idx == 0) {
//                 d = 1;
//             } else if (idx == numRows - 1) {
//                 d = -1;
//             }
//             idx += d;
//         }

//         StringBuilder result = new StringBuilder();
//         for (List<Character> row : rows) {
//             for (char c : row) {
//                 result.append(c);
//             }
//         }

//         return result.toString();        
//     }
// }