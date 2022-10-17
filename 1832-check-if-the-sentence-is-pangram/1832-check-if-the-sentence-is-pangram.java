class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] check = new int[26];
        
        for(char ch : sentence.toCharArray()){
            check[ch -'a']++;
        }
        
        for(int num : check){
            if(num == 0) return false;
        }
        return true;
    }
}
