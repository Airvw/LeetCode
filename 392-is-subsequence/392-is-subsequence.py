class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if s == "":
            return True
        
        pos = 0
        for c in t:
            if pos < len(s):
                if s[pos] == c:
                    pos += 1
        if pos == len(s):
            return True
        else:
            return False