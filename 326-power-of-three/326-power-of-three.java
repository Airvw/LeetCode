class Solution {
    int[] dp = new int[32];
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        dp[0] = 1;
        for (int i = 1; i < 32; i++) {
            dp[i] = dp[i - 1] * 3;
            if (dp[i] == n) return true;
            if (dp[i] > n) return false;
        }
        return false;
    }
}