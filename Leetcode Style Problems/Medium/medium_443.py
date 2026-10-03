# 443. String Compression
class Solution:
    def compress(self, chars: List[str]) -> int:
        length = len(chars)
        anchor = 0
        write = 0
        if length < 2:
            return length
        for pos, char in enumerate(chars):
            if (pos + 1) == length or char != chars[pos+1]:
                chars[write] = char
                write += 1
                if pos > anchor:
                    repeated_times = pos - anchor + 1
                    for num in str(repeated_times):
                        chars[write] = num
                        write += 1
                anchor = pos + 1
              
        return write

