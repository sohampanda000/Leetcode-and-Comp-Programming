# 1957. Delete Characters to Make Fancy String
class Solution(object):
    def makeFancyString(self, s):
        if len(s) <= 2:
            return s
        
        result = [s[0], s[1]]
        for i in range(2, len(s)):
            if s[i] != s[i - 1] or s[i] != s[i - 2]:
                result.append(s[i])
        
        return ''.join(result)
