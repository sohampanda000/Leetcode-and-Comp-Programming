# 7. Reverse Integer
class Solution:
    def reverse(self, x: int) -> int:
        reversed_str = str(abs(x))[::-1]
        reversed_int = int(reversed_str)
        
        if x < 0:
            reversed_int = -reversed_int
        if reversed_int < -2 ** 31 or reversed_int > 2 ** 31 - 1:
            return 0
        
        return reversed_int
