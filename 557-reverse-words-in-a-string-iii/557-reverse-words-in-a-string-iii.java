class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] values = s.split(" ");
        int n = values.length;
        int cnt = 1;
        for(String str : values){
            sb.append(getReverse(str));
            if(cnt++ < n) sb.append(" ");
        }

        return sb.toString();
    }

    private StringBuilder getReverse(String str) {
        StringBuilder temp = new StringBuilder(str);
        return temp.reverse();
    }
}
