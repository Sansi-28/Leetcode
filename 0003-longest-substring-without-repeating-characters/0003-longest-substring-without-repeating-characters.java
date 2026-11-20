class Solution {
    public static boolean has( String str, char c ){

        for (int i = 0; i < str.length() ; i++) {

            if( str.charAt(i) == c )return true;
        }
        return false;
    }

    public static int lengthOfLongestSubstring(String s) {


        // here we will apply sliding window
        // s = "pwwkew"
        if(s.length() == 0) return 0;
        
        if( s.length() == 1)return 1;

        int left = 0, right = 1, maxLenth = Integer.MIN_VALUE;

        while(left < right && right != s.length()) {

//            String str;

            while (true) {

                String str = s.substring(left, right);

//                String str1 = s.substring(left, right-1);

                if(right != s.length() && !has(str, s.charAt(right)))
                {
                    break;
                }

                left++;


            }

            maxLenth = (maxLenth < right - left + 1 ) ? right - left +1 : maxLenth;

            right++;

        }

        return maxLenth;

        }
} 