class Solution:
    def intervalIntersection(self, A: List[List[int]], B: List[List[int]]) -> List[List[int]]:
        
        lenA, lenB, result, i, j = len(A), len(B), [], 0, 0
        while i < lenA and j < lenB:
            # x tracks the interval with earlier finish time, set to list A by default
            x, y, i = A[i], B[j], i + 1
            # if y finish ealier than x, keeping x unchanged and compare it with the next ele in B, swap x,y to make sure the following rule works
            if x[1] > y[1]: x, y, i, j = y, x, i-1, j+1
            if y[0] <= x[1]: result.append([max(x[0], y[0]), x[1]])
        return result
    
        """
        slower but easy to understand
        ans = []
        i = j = 0

        while i < len(A) and j < len(B):
            # Let's check if A[i] intersects B[j].
            # lo - the startpoint of the intersection
            # hi - the endpoint of the intersection
            lo = max(A[i][0], B[j][0])
            hi = min(A[i][1], B[j][1])
            if lo <= hi:
                ans.append([lo, hi])

            # Remove the interval with the smallest endpoint
            if A[i][1] < B[j][1]:
                i += 1
            else:
                j += 1

        return ans
        """ 
        