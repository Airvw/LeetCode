class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        StringBuilder sb = new StringBuilder();
        int[] checkCnt = new int[10];
        String str = countAndSay(n - 1);

        char prev = str.charAt(0);
        for(char ch : str.toCharArray()){
            if(prev != ch){
                sb.append(checkCnt[prev - '0']);
                sb.append(prev);
                checkCnt[prev - '0'] = 0;
                checkCnt[ch - '0']++;
                prev = ch;
            }
            else {
                checkCnt[ch - '0']++;
            }
        }
        if(checkCnt[prev - '0'] > 0){
            sb.append(checkCnt[prev - '0']);
            sb.append(prev);
        }

        return sb.toString();
    }
}