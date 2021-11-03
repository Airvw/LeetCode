class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        pascal = []
        pascal.append([1])
        
        if numRows < 2:
            return pascal
        
        pascal.append([1, 1])
        
        if numRows == 2:
            return pascal
        
        for i in range(3, numRows + 1):
            tmp = []
            tmp.append(1)
            for j in range(1, i - 1):
                tmp.append(pascal[-1][j - 1] + pascal[-1][j])
            tmp.append(1)
            pascal.append(tmp)
        return pascal
        