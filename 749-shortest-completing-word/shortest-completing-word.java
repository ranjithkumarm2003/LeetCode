class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] targetFreq = new int[26];
        
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                targetFreq[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String result = null;

        for (String word : words) {
            int[] wordFreq = new int[26];

            for (char ch : word.toCharArray()) {
                wordFreq[Character.toLowerCase(ch) - 'a']++;
            }

            if (isCompletingWord(targetFreq, wordFreq)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

 
    private boolean isCompletingWord(int[] targetFreq, int[] wordFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < targetFreq[i]) {
                return false;
            }
        }
        return true;
    }
}