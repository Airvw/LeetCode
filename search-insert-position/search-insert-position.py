class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        result = 0
        left = 0 
        right = len(nums) - 1
        
        if target < nums[0]:
            return 0
        if target > nums[-1]:
            return len(nums)
        
        while left <= right:
            mid = (left + right) // 2
            
            if target > nums[mid] and target < nums[mid + 1]:
                result = mid + 1
            
            if nums[mid] == target:
                result = mid
                break
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        return result