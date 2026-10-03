# 1. Two Sum
class Solution(object):
    def twoSum(self, nums, target):
        final_list = []

        for i in range(len(nums)):
            for j in range(i):
                if nums[i] + nums[j] == target:
                    final_list.append(j)
                    final_list.append(i)
                    return final_list

        return None
