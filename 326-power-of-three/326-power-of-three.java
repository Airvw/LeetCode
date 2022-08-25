class Solution {
    public boolean isPowerOfThree(int n) {
        int limit = 1;
        for(int i = 1; i < 32; i++){
            
            if(limit * 3 < 0) break;
            limit *= 3;
        }
        return n > 0 && limit % n == 0;
    }
}