# 345. Reverse Vowels of a String
class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels_in_word = []
        constructed_word = []
        vowel_index = 0

        for i in range(len(s)):
            if self.check_for_vowel(s[i]):
                vowels_in_word.append(s[i])

        reversed_vowels = vowels_in_word[::-1]

        for k in range(len(s)):
            if self.check_for_vowel(s[k]):
                constructed_word.append(reversed_vowels[vowel_index])
                vowel_index += 1
            else:
                constructed_word.append(s[k])

        return "".join(constructed_word)

    def check_for_vowel(self, letter):
        lower = letter.lower()
        if lower == "a" or lower == "e" or lower == "i" or lower == "o" or lower == "u":
            return True

