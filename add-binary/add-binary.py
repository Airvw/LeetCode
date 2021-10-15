class Solution:
    def addBinary(self, a: str, b: str) -> str:
        an, bn = 0, 0
        
        for ch in a:
            an = an * 2 + int(ch)
        
        for ch in b:
            bn = bn * 2 + int(ch)
        
        return str(bin(an + bn)[2:])
            