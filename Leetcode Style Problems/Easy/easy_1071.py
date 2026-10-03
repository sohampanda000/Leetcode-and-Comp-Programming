# 1071. Greatest Common Divisor of Strings
class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        s1 = len(str1)
        s2 = len(str2)

        if str1 + str2 != str2 + str1:
            return ""

        divisor = math.gcd(s1, s2)
        return str1[0:divisor]

