class Solution:
    def isHappy(self, n: int) -> bool:
        d = {}
        nstr = str(n)
        while True:
            if nstr not in d:
                d[nstr] = 1
            else:
                d[nstr] += 1
            if d[nstr] == 2:
                return False
            nstr = str(sum(int(ch) ** 2 for ch in nstr))
            if nstr == "1":
                return True