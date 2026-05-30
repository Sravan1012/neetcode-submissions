class Solution {
    private boolean palindrome(String s, int low, int high) {
        while(low < high) {
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }

        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int low = 0, high = n - 1;
        while(low < high) {
            if(s.charAt(low) != s.charAt(high)) return palindrome(s, low, high - 1) || palindrome(s, low + 1, high);
            low++;
            high--;
        }

        return true;
    }
}