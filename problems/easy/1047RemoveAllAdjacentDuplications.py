class Solution:
    def removeDuplicates(self, S: str) -> str:
        result = ""
        for ch in S:
            if len(result) > 0:
                if result[-1] == ch:
                    result = result[:-1]
                    continue
            result = result + ch
        return result