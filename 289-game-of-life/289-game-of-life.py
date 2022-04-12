class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        dx = [-1, -1, -1, 0, 1, 1, 1, 0]
        dy = [-1, 0, 1, 1, 1, 0, -1, -1]
        n = len(board)
        m = len(board[0])
        
        result = [[0] * m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                cnt = 0
                if board[i][j] == 0:
                    for k in range(8):
                        nx = i + dx[k]
                        ny = j + dy[k]
                        if nx >= n or ny >= m or nx < 0 or ny < 0:
                            continue
                        if board[nx][ny] == 1:
                            cnt += 1
                    result[i][j] = cnt
                else:
                    for k in range(8):
                        nx = i + dx[k]
                        ny = j + dy[k]
                        if nx >= n or ny >= m or nx < 0 or ny < 0:
                            continue
                        if board[nx][ny] == 1:
                            cnt += 1
                    result[i][j] = cnt
        for i in range(n):
            for j in range(m):
                if board[i][j] == 0:
                    if result[i][j] == 3:
                        board[i][j] = 1
                else:
                    if result[i][j] < 2 or result[i][j] > 3:
                        board[i][j] = 0
        
        return board