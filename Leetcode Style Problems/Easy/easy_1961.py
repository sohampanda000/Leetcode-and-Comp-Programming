# 1961. Check If String Is a Prefix of Array
class Solution(object):
    def isPrefixString(self, s, words):
        self.s = s
        self.words = words

        prefix = ""
        for word in words:
            prefix += word
            if prefix == s:
                return True
            if len(prefix) > len(s):
                return False
