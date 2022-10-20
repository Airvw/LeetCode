class Solution {
    public String intToRoman(int num) {
        String[] strArr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV", "I"};
        int[] valueArr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while(num > 0){
            if(num >= valueArr[idx]) {
                sb.append(strArr[idx]);
                num -= valueArr[idx];
            }
            else{
                idx++;
            }
        }
        return sb.toString();
    }
}