class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char ch = board[i][j];
                if(ch != '.'){
                    String val = "(" + ch + ")";
                    if(!set.add(i + val) || !set.add(val + j) || !set.add(i / 3 + val + j / 3)) return false;
                }
            }
        }

        return true;
    }
}