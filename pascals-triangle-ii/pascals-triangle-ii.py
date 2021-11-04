class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        result = [[1]]
        for i in range(1, rowIndex + 1):
            tmp = [1]
            for j in range(1, i):
                tmp.append(result[-1][j - 1] + result[-1][j])
            tmp.append(1)
            result.append(tmp)
        return result[rowIndex]
        
        