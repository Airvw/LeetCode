class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int aCnt = 0;
        int bCnt = 0;
        for(int i = 0; i < n; i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(i < n / 2){
                aCnt += checkVowel(ch);
            }
            else{
                bCnt += checkVowel(ch);
            }
        }
        return aCnt == bCnt;
    }

    private int checkVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u') return 1;
        return 0;
    }

}