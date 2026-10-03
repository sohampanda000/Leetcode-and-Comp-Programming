# 2942. Find Words Containing Character
class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        result = []
        i = 0
        for word in words:
            for letter in word:
                if letter == x:
                    result.append(i)
                    break
            i = i + 1
        
        return result
