class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        StringBuilder sb = new StringBuilder();
        String str = countAndSay(n - 1);

        char prev = str.charAt(0);
        int cnt = 0;
        for(char ch : str.toCharArray()){
            if(prev != ch){
                sb.append(cnt).append(prev);
                prev = ch;
                cnt = 1;
            }
            else {
                cnt++;
            }
        }
        if(cnt > 0){
            sb.append(cnt).append(prev);
        }

        return sb.toString();
    }
}