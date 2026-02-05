class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        int time = 0;

        for (int i = 0; i < logs.size(); i++) {

            String str = logs.get(i);
            String[] parts = str.split(":");

            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int t = Integer.parseInt(parts[2]);

            if (type.equals("start")) {

                if (!st.isEmpty()) {
                    mp.put(st.peek(),
                           mp.getOrDefault(st.peek(), 0) + (t - time));
                }

                st.push(id);
                time = t;

            } else {

                mp.put(st.peek(),
                       mp.getOrDefault(st.peek(), 0) + (t - time + 1));
                st.pop();
                time = t + 1;
            }
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = mp.getOrDefault(i, 0);
        }

        return ans;
    }
}
