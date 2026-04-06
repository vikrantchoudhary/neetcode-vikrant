class Solution:
   
    def isInterleave(self, s1: str, s2: str, s3: str) -> bool:
        self.dp = {}
        if (len(s1) + len(s2) != len(s3)):
            return False;
        return self.dfs(0,0,0,s1,s2,s3)
    
    def dfs(self,i: int, j:int,k:int ,s1: str, s2: str, s3: str)->bool:
        if (k == len(s3)):
            return (i == len(s1) and j == len(s2))
        if ((i,j) in self.dp) :
            return self.dp[(i,j)]
        res = False
        if (i < len(s1) and s1[i] == s3[k]):
            res = self.dfs(i+1,j,k+1,s1,s2,s3)
        if (not res and j < len(s2) and s2[j] == s3[k]):
            res = self.dfs(i,j+1,k+1,s1,s2,s3)
        self.dp[(i,j)] = res
        return res