class Solution {

    long modulo = 1000000007;

    public int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        long result = 0;
        for(int i = 1; i <=n; i++){
            int len = Integer.toBinaryString(i).length();
            result = ((result << len) + i) % modulo;
        }
        return (int) result;
    }
}