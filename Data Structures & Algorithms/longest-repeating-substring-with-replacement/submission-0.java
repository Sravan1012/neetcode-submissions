class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int i = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int j = 0; j < s.length(); j++) {
            int idx = s.charAt(j) - 'A';

            freq[idx]++;
            maxFreq = Math.max(maxFreq, freq[idx]);

            while ((j - i + 1) - maxFreq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}