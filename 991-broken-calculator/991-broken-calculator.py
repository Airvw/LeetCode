class Solution:
    def brokenCalc(self, startValue: int, target: int) -> int:
        answer = 0
        while target > startValue:
            answer += 1
            if target % 2:
                target += 1
            else:
                target //= 2
        return answer + startValue - target