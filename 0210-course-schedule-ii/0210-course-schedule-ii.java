class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        boolean[] isVisited = new boolean[numCourses];

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            graph.get(b).add(a); 
            indegree[a]++;
        }

        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
                isVisited[i] = true;
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            list.add(node);

            for (int next : graph.get(node)) {
                indegree[next]--;
                if (indegree[next] == 0 && !isVisited[next]) {
                    q.offer(next);
                    isVisited[next] = true;
                }
            }
        }

        if (list.size() != numCourses) return new int[0];

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);
        return arr;
    }
}