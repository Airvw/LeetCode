class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i = 0
        j = 0
        n = len(t)
        m = len(s)
        if m == 0:
            return True
        if n == 0:
            return False
        
        while True:
            if s[i] == t[j]:
                i += 1
                j += 1
            else:
                j += 1
            if i == m:
                return True
            if j == n:
                break
        return False
                