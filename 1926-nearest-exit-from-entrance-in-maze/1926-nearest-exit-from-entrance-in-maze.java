class Pair {
    int x;
    int y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    public int nearestExit(char[][] maze, int[] entrance) {
        Deque<Pair> dq = new ArrayDeque<>();
        int n = maze.length;
        int m = maze[0].length;
        int[][] check = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(maze[i][j] == '+') check[i][j] = -1;
            }
        }
        int ex = entrance[0];
        int ey = entrance[1];
        maze[ex][ey] = 'e';
        dq.add(new Pair(ex, ey));
        while(!dq.isEmpty()){
            Pair now = dq.pollFirst();
            int x = now.x;
            int y = now.y;
            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && check[nx][ny] == 0){
                    check[nx][ny] = check[x][y] + 1;
                    dq.add(new Pair(nx, ny));
                }
                if((nx < 0 || nx >= n || ny < 0 || ny >= m) && maze[x][y] != 'e'){
                    return check[x][y];
                }
            }
        }
        return -1;
    }
}