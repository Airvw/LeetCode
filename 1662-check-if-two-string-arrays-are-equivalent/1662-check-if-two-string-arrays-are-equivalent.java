
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        for(String word : word1)
            sbA.append(word);
        for(String word : word2){
            sbB.append(word);
        }
        
         if(sbA.toString().equals(sbB.toString()))
            return true;
        return false;
    }
}