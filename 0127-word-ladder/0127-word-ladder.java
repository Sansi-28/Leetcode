class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        int n = wordList.size();
        boolean[] isVisited = new boolean[n];
        q.offer(beginWord);

        int val = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                String cur = q.poll();
                if (cur.equals(endWord)) return val;

                for (int i = 0; i < n; i++) {
                    if (!isVisited[i] && isValid(wordList.get(i), cur)) {
                        isVisited[i] = true;
                        q.offer(wordList.get(i));
                    }
                }
            }
            val++;
        }
        return 0;
    }

    boolean isValid(String s1, String s2) {
        int n = s1.length(), count = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) count++;
            if (count > 1) return false;
        }
        return true;
    }
}