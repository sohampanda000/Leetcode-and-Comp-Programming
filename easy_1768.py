# 1768. Merge Strings Alternately
class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        n1 = len(word1)
        n2 = len(word2)

        p1 = 0
        p2 = 0

        letters = []

        while p1 < n1 or p2 < n2:
            if p1 < n1:
                letters.append(word1[p1])
                p1 += 1
            if p2 < n2:
                letters.append(word2[p2])
                p2 += 1

        return "".join(letters)
