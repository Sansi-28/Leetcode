class Solution {
    public int romanToInt(String s) {
        int left = 0, right = 0, sum = 0;

        while (right < s.length()-1){
            if(romanVal(s.charAt(left)) >= romanVal(s.charAt(++right))){
                sum = sum + romanVal(s.charAt(left));
                left = right;
            }else {
                int val = romanVal(s.charAt(right)) - romanVal(s.charAt(left));
                sum = sum + val;
                right++;
                left = right;
            }
        }
        if(right < s.length()){
            sum = sum + romanVal(s.charAt(right));
        }

        return sum ;
        
    }

    public int romanVal(char s){
        switch(s){
            case 'I': return 1; 
            
            case 'V': return 5;
        
            case 'X': return 10;
        
            case 'L': return 50;
        
            case 'C': return 100;
        
            case 'D': return 500;
        
            case 'M': return 1000;
        
            default : return 0;
        }
    }
}