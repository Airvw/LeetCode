class Solution:
    def isValid(self, s: str) -> bool:
        d = {
            "(" : ")",
            "{" : "}",
            "[" : "]"
        }
        st = []
        
        for c in s:
            if c in d:
                st.append(c)
            else:
                if not st or d[st.pop()] != c:
                    return False

        return not st
        
        