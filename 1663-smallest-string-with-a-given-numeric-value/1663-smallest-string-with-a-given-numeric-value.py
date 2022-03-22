class Solution:
    def getSmallestString(self, n: int, k: int) -> str:
        remain = k - n
        answer = ""
        d = {}
        for i in range(26):
            d[i + 1] = chr(97 + i)
        keys = [1] * n
        
        idx = 0
        while remain >= 26:
            keys[idx] += 25
            remain -= 25
            idx += 1
        keys[idx] += remain

        for key in keys[::-1]:
            answer += d[key]
        return answer
            
            
        
        
        
        