class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] checkWord1 = new int[26];
        int[] checkWord2 = new int[26];

        int n = word1.length();
        int m = word2.length();
        if(n != m) return false;

        for(int i = 0; i < n; i++){
            checkWord1[word1.charAt(i) - 'a']++;
            checkWord2[word2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(checkWord1[i] > 0 && checkWord2[i] > 0) continue;
            if(checkWord1[i] > 0 || checkWord2[i] > 0) return false;
        }

        Arrays.sort(checkWord1);
        Arrays.sort(checkWord2);

        if(!Arrays.equals(checkWord1, checkWord2)) return false;
        
        return true;
    }
}
