class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        l = []
        for idx, row in enumerate(mat):
            l.append([idx, row.count(1)])
        l.sort(key = lambda x : x[1])
        answer = [l[i][0] for i in range(k)]
        
        return answer