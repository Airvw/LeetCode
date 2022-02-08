class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums.sort(reverse = True)
        cnt = 1
        Max = nums[0]
        curr = Max
        for i in nums[1:]:
            if i != curr:
                cnt += 1
                curr = i
            if cnt == 3:
                break
        if cnt == 3:
            return curr
        else:
            return Max