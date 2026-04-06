class Solution {
    private List<Integer> courseList = new ArrayList<>();
    private int[] course;
    private List<List<Integer>> courseNode;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        courseNode = new ArrayList<>();
        for (int i =0 ; i< numCourses ; i++) {
            courseNode.add(new ArrayList<>());
        }
        course = new int[numCourses];
        for (int[] preCrs : prerequisites) {
            course[preCrs[0]]++;
            courseNode.get(preCrs[1]).add(preCrs[0]);
        }
        for (int i = 0; i< numCourses;i++) {
            if (course[i] == 0) {
                dfs(i);
            }
        }
        if (courseList.size() != numCourses) return new int [0];
        int []result = new int [numCourses];
        for (int i = 0 ; i < numCourses;i++) {
            result[i] = courseList.get(i);
        }
        return result;
    }
    private void dfs(int crs) {
        courseList.add(crs);
        course[crs]--;
        for (int nei : courseNode.get(crs)) {
            course[nei]--;
            if (course[nei] == 0) { 
                dfs(nei);
            }
            //course[nei]++;
        }
    }
}
