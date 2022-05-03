class Solution:
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        answer = 0
        left, right = 0, len(nums) - 1
        leftFlag = False
        rightFlag = False
        leftCnt = 0
        rightCnt = 0
        while left < right:
            if nums[left] < nums[left + 1]:
                leftCnt = 0
                left += 1
            elif nums[left] == nums[left + 1]:
                leftCnt += 1
                left += 1
            else:
                leftFlag = True
            if nums[right - 1] < nums[right]:
                rightCnt = 0
                right -= 1
            elif nums[right - 1] == nums[right]:
                rightCnt += 1
                right -= 1
            else:
                rightFlag = True
            if leftFlag and rightFlag:
                break
        if not leftFlag and not rightFlag:
            return 0
        if leftCnt:
            left -= leftCnt
        if rightCnt:
            right += rightCnt
        
        minVal = min(nums[left:right + 1])
        maxVal = max(nums[left:right + 1])
        while left > 0:
            if minVal < nums[left - 1]:
                left -= 1
            else:
                break
        
        while right < len(nums) - 1:
            if maxVal > nums[right + 1]:
                right += 1
            else:
                break
        
            
        answer = len(nums[left:right + 1])
        return answer        
            
                