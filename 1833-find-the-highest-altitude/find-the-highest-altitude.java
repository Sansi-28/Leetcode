class Solution {
    public int largestAltitude(int[] gain) {

        int max = 0;
        int sum = 0;

        for(int e : gain){
            sum += e;

            max = (max > sum) ? max : sum;
        }

        return max;
        
    }
}