class Solution {
    public String licenseKeyFormatting(String s, int k) {
        Stack<Character> st = new Stack<>();

        int n = s.length();

        int count = 0;

        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);

            if(ch != '-'){
                if(count < k){
                    st.push(Character.toUpperCase(ch));
                    
                }else{
                    st.push('-');
                    st.push(Character.toUpperCase(ch));
                    count = 0;
                }
                count ++;
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
    }
}