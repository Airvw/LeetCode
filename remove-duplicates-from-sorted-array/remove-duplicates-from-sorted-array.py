class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if not nums:
            return 0
        
        index = 0

        change_index = 1
        for i in range(0, len(nums)):
            if i != 0 and nums[i - 1] != nums[i]:
                nums[change_index] = nums[i]
                change_index += 1

        return change_index
        