class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        self.dp ={}
        n = len(word1)
        m = len(word2)
        return self.dfs(0,0,word1,word2)
    
    def dfs(self,i:int, j:int , word1:str , word2 : str) -> int :
        n = len(word1)
        m = len(word2)
        if i == n:
            return m -j
        if j == m :
            return n - i
        if (i,j) in self.dp :
            return self.dp[(i,j)]
        if word1[i] == word2[j]:
            self.dp[(i,j)] = self.dfs(i+1,j+1,word1,word2)
        else:
            res = min(self.dfs(i+1,j,word1,word2),self.dfs(i,j+1,word1,word2))
            res = min(res,self.dfs(i+1,j+1,word1,word2))
            self.dp[(i,j)] = res +1
        return self.dp[(i,j)]
        