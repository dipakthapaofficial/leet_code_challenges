class Solution:
    def twoSum(self, nums, target):
        """
            link to task:
                https://leetcode.com/problems/two-sum/
        """
        indexes = []
        for idx in range(0, len(nums)):
            if target - nums[idx] in nums and nums.index(target - nums[idx]) != idx:
                indexes.append(nums.index(target - nums[idx]))
                indexes.append(idx)
                return indexes



nums = [3, 3]
target = 6
solution = Solution()
solution.twoSum(nums, target)