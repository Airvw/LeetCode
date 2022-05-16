from collections import deque

class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        n = len(grid)
        if grid[n - 1][n - 1] == 1 or grid[0][0] == 1:
            return -1
        q = deque()
        q.append([0, 0])
        grid[0][0] = 1
        move = [[-1, -1], [-1, 0], [-1, 1], [0, 1], [1, 1], [1, 0], [1, -1], [0, -1], [-1, -1]]
        while q:
            x, y = q.popleft()
            for i in range(len(move)):
                nx = x + move[i][0]
                ny = y + move[i][1]
                if nx < 0 or ny < 0 or nx >= n or ny >= n or grid[nx][ny] >= 1:
                    continue
                grid[nx][ny] = grid[x][y] + 1
                q.append([nx, ny])
                
        if grid[n - 1][n - 1]:
            return grid[n - 1][n - 1]
        return -1
        