class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int max = 0;

        while(j < n) {
            char ch = s.charAt(j);
            if(set.contains(ch)) {
                while(set.contains(ch)) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(ch);
            max = Math.max(max, set.size());
            j++;
        }

        return max;
    }
}
