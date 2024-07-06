#Author: Varsha Rajawat
#Source: https://leetcode.com/problems/two-sum/description/?source=submission-ac
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #Create a dictionary to store numbers and their indices
        nums_dict = {}

        #iterate over the nums list
        for i, num in enumerate(nums):
            complement = target - num

            if complement in nums_dict:
                return [nums_dict[complement], i]
            
            nums_dict[num] = i
        
        return []
