class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        
        

        for(int i = 1; i <= n/2; i++){
            String str = s.substring(i) + s.substring(0, i);
            if(str.equals(s))return true;
        }

        return false;
    }
}