class Solution {
    public String breakPalindrome(String palindrome) {
        StringBuilder sb = new StringBuilder("");
        int n = palindrome.length();
        if(n == 1) return sb.toString();
        int reStartIdx = n / 2;
        boolean isChanged = false;
        for(int i = 0 ; i < n / 2; i++){
            sb.append(checkA(palindrome.charAt(i)));
            if(sb.charAt(i) != palindrome.charAt(i)){
                isChanged = true;
                reStartIdx = i + 1;
                break;
            }
        }
        if(isChanged){
            for(int i = reStartIdx; i < n; i++){
                sb.append(palindrome.charAt(i));
            }
            return sb.toString();
        }
        
        for(int i = reStartIdx; i < n - 1; i++){
            sb.append(palindrome.charAt(i));
        }

        sb.append("b");

        return sb.toString();
    }

    private StringBuilder checkA(char ch) {
        StringBuilder sb = new StringBuilder();
        if(ch != 'a') return sb.append('a');
        return sb.append(ch);
    }
}