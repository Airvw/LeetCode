class Solution:
    def getSmallestString(self, n: int, k: int) -> str:
        answer = ['a'] * n
        k = k - n
        
        while k > 0:
            n -= 1
            answer[n] = chr(ord(answer[n]) + min(25, k))
            k -= min(25, k)
        
        return ''.join(answer)