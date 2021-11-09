class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        cnt = 0
        nums.sort()
        for i in range(len(nums) - 1):
            cnt += 1
            if cnt > len(nums)//2:
                return nums[i]
            if nums[i] != nums[i + 1]:
                cnt = 0
        return nums[-1]