class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, n = prices.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i] - min);
            }
        }

        return max;
    }
}
