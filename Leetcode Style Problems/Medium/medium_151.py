# 151. Reverse Words in a String
class Solution:
    def reverseWords(self, s: str) -> str:
        given_words = s.split()
        reversed_words = given_words[::-1]
        result = []
        for i in range(len(reversed_words)):
            result.append(" ")
            result.append(reversed_words[i])
        return "".join(result).strip()

# ALTERNATIVELY:
"""
class Solution:
    def reverseWords(self, s: str) -> str:
        return " ".join(s.split()[::-1])
"""

