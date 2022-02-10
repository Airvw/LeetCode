class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = []
        for c in s:
            if c.isalnum():
                st.append(c.lower())
        while len(st) > 1:
            if st.pop(0) != st.pop():
                return False
        else:
            return True