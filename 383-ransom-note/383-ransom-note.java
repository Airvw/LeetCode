class Solution {
    
    private int[] alpha = new int[26];
    
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < magazine.length(); i++){
            alpha[magazine.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            alpha[ransomNote.charAt(i) - 'a']--;
        }
        
        for(int num : alpha){
            if(num < 0) return false;
        }
        
        return true;
    }
}