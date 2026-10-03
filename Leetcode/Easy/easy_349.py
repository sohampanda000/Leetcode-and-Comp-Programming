# 349. Intersection of Two Arrays
class Solution(object):
    def intersection(self, nums1, nums2):
        s = []
        t = []
        for num1 in nums1:
            for num2 in nums2:
                if num1 == num2:
                    s.append(num1)
                    break
        for i in s:
            if i not in t:
                t.append(i)
        return t
