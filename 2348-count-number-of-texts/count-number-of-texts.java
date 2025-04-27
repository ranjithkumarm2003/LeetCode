public class Solution {
    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        return dfs(pressedKeys, 0, new Integer[n]);
    }
    
    private int dfs(String s, int i, Integer[] memo) {
        if (i == s.length()) return 1;
        if (memo[i] != null) return memo[i];
        
        int count = 0;
        char c = s.charAt(i);
        int maxPress = (c == '7' || c == '9') ? 4 : 3;
        
        for (int j = 0; j < maxPress && i + j < s.length() && s.charAt(i + j) == c; j++) {
            count = (count + dfs(s, i + j + 1, memo)) % 1_000_000_007;
        }
        
        return memo[i] = count;
    }
}
