class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        self.dp = {}
        rows,cols = len(matrix), len(matrix[0])
        ans = 0
        for r in range(rows):
            for c in range(cols):
                ans = max(ans, self.dfs(r,c,-1,matrix))
        return ans
    
    def dfs( self ,r : int , c : int, prev_value : int , matrix :List[List[int]])-> int:
        if (r < 0 or c <0 or r >= len(matrix) or c >= len(matrix[0]) 
            or matrix[r][c] <= prev_value):
             return 0
        if (r,c) in self.dp :
            return self.dp[(r,c)]
        res = 1
        res = max(res,1+self.dfs(r - 1,c,matrix[r][c],matrix))
        res = max(res,1+self.dfs(r + 1,c,matrix[r][c],matrix))
        res = max(res,1+self.dfs(r,c - 1,matrix[r][c],matrix))
        res = max(res,1+self.dfs(r,c + 1,matrix[r][c],matrix))
        self.dp[(r,c)] = res
        return res