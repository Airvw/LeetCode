class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] setRow = new HashSet[n];
        HashSet<Character>[] setCol = new HashSet[n];
        HashSet<Character>[] setSquare = new HashSet[n];

        for(int i = 0; i <9; i++){
            setRow[i] = new HashSet<>();
            setCol[i] = new HashSet<>();
            setSquare[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if(!setRow[i].add(ch) || !setCol[j].add(ch) || !setSquare[(i / 3) * 3 + j / 3].add(ch)) return false;
                }
            }
        }
        return true;
    }
}