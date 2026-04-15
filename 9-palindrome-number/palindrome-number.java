class Solution {
    public boolean isPalindrome(int n) {
        int reverse = 0;

        int temp = Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        return (reverse == n);
    }
}