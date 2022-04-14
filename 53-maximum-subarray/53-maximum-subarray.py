class Solution:

    def maxSubArray(self, nums: List[int]) -> int:
        dp = [num for num in nums]
        n = len(nums)
        for i in range(1, n):
            dp[i] = max(dp[i - 1] + dp[i], dp[i])
        
        
        return max(dp)
        