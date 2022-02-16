class Solution:
    def reverseString(self, s: List[str]) -> None:
        i = 0
        j = len(s) - 1
        for _ in range(len(s)//2):
            s[i], s[j] = s[j], s[i]
            i += 1
            j -= 1
            
        