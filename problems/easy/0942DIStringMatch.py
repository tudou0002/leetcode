class Solution:
    def diStringMatch(self, S: str) :
        high = len(S)
        low = 0
        result = []
        for ch in S:
            if (ch == 'I'):
                result.append(low)
                low += 1
            else:
                result.append(high)
                high -= 1
        result.append(low)
        return result