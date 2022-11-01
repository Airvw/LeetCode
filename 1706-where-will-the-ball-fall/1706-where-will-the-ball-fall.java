class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid[0].length;
        int[] answer = new int[m];

        for(int j = 0; j < m; j++){
            answer[j] = goDown(j, grid);
        }
        return answer;
    }

    private int goDown(int j, int[][] grid) {
        int n = grid.length;
        int m =grid[0].length;
        int i = 0;
        while(i >= 0 && i < n && j >= 0 && j < m){
            if(grid[i][j] == 1){
                if(j < m - 1 && grid[i][j + 1] == -1) break;
                i++;
                j++;
            }
            else{
                if(j >= 1 && grid[i][j - 1] == 1) break;
                i++;
                j--;
            }
        }
        if(i != n || j < 0 || j >= m) return -1;
        return j;
    }
}