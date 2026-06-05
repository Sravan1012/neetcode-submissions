class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        int l = 0, r = n - 1;
        while(l < r) {
            int a = Math.min(heights[l], heights[r]) * (r - l);
            max = Math.max(max, a);
            if(heights[l] > heights[r]) r--;
            else l++;
        }
        return max;
    }
}
