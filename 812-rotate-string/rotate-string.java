class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        
        

        for(int i = 1; i <= n; i++){
            String str = s.substring(i) + s.substring(0, i);
            if(str.equals(goal))return true;
        }

        return false;
    }
}