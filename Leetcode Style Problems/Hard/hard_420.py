# 420. Strong Password Checker
class Solution(object):
    def strongPasswordChecker(self, password):
        missing_types = 3 - sum((int(any(c.islower() for c in password)),
                         int(any(c.isupper() for c in password)),
                         int(any(c.isdigit() for c in password))))

        total_changes, one_change, two_change, p_len = 0, 0, 0, len(password)
        i = 2
        
        while i < p_len:
            if password[i] == password[i-1] == password[i-2]:
                length = 2
                while i < p_len and password[i] == password[i-1]:
                    i += 1
                    length += 1
                
                total_changes += length // 3
                if length % 3 == 0: one_change += 1
                elif length % 3 == 1: two_change += 1
            else:
                i += 1
                
        if p_len < 6:
            return max(missing_types, 6 - p_len)
        elif p_len <= 20:
            return max(missing_types, total_changes)
        else:
            deletions_needed = p_len - 20
            total_changes -= min(deletions_needed, one_change * 1) // 1
            total_changes -= min(max(deletions_needed - one_change, 0), two_change * 2) // 2
            total_changes -= max(deletions_needed - one_change - 2 * two_change, 0) // 3
            
            return deletions_needed + max(missing_types, total_changes)
            
        """
        :type password: str
        :rtype: int
        """
