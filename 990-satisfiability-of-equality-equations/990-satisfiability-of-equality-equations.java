class Solution {
    int[] bridge = new int[26];
    public boolean equationsPossible(String[] equations) {
        for(int i = 0; i < 26; i++){
            bridge[i] = i;
        }


        for(String str : equations){
            char a = str.charAt(0);
            char b = str.charAt(3);
            if(str.charAt(1) == '='){
                bridge[find(a - 'a')] = bridge[find(b - 'a')];
            }
        }
        
        for(String str : equations){
            char a = str.charAt(0);
            char b = str.charAt(3);
            if(str.charAt(1) == '!' && bridge[find(a - 'a')] == bridge[find(b - 'a')]){
                return false;
            }
        }
        
        return true;
    }

    private int find(int x) {
        if(bridge[x] == x) return bridge[x];
        return bridge[x] = find(bridge[x]);
    }
}