class Solution:
    def isPalindrome(self, x: int) -> bool:
        result = True
        x_str = str(x)
        x_len = len(x_str) // 2
        for i in range(x_len):
            if x_str[i] != x_str[-1 - i]:
                result = False
            if result == False:
                break
        return result