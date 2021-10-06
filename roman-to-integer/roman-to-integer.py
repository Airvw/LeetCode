class Solution:
    def romanToInt(self, s: str) -> int:
        d = {"I" : 1, "V" : 5, "X" : 10, "L" : 50, "C" : 100, "D" : 500, "M" : 1000}
        result = 0
        for i in range(len(s) - 1):
            nowNum = d[s[i]]
            nextNum = d[s[i + 1]]
            if nowNum < nextNum:
                result -= nowNum
            else:
                result += nowNum
        result += d[s[-1]]
        return result