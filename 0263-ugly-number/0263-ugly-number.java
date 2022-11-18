class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        for(int div : new int[]{2, 3, 5}){
            n = checkUgly(n, div);
        }
        return n == 1;
    }

    private int checkUgly(int n, int div) {
        while(n % div == 0){
            n /= div;
        }
        return n;
    }
}