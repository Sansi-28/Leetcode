class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long sum = 0;

        int n = target.length;

        for(int i = 0; i < n; i++){
            pq.offer(target[i]);
            sum += target[i];
        }

        long rem = 1;



        while(!pq.isEmpty() && pq.peek() > 1){
            if(pq.isEmpty()){
                break;
            }
            
            int val = pq.poll();
            long rest = sum - val;

            if (rest == 1) return true;    
            if (rest == 0 || rest >= val) return false;

            rem = val % rest;

            if(rem == 0)return false;

            if(rem >= 1){
                pq.offer((int)rem);
            }else{
                return false;
            }


            sum = sum - val + rem;

        }

        while(!pq.isEmpty()){
            if(pq.poll() != 1)return false;
        }


       return true;
        
    }
}