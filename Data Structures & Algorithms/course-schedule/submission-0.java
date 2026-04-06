class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0;i<numCourses;i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites ) {
            adjList.get(prerequisite[1]).add(prerequisite[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];
        for (int i =0 ; i< numCourses;i++) {
            if (isCyclic(i,adjList,visited,recStack)) return false;
        }
        return true;
    }
    public boolean isCyclic(int course, List<List<Integer>> adjList,boolean[] visited, boolean[]recStack) {
        if (recStack[course]) return true;
        if (visited[course]) return false;
        recStack[course] =true;
        visited[course] = true;
        for (int neighour : adjList.get(course)) {
            if (isCyclic(neighour,adjList,visited,recStack)) return true;
        }
        recStack[course] = false;
        return false;
    }
}
