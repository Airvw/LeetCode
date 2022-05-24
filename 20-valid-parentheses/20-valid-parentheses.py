class Solution:
    def isValid(self, s: str) -> bool:
        d = {"(" : ")", "{" : "}", "[" : "]"}
        st = []
        for c in s:
            if c in d:
                st.append(c)
            elif len(st) == 0 or d[st.pop()] != c:
                return False
            
               
        return len(st) == 0