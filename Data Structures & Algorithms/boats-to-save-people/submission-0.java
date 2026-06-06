class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n - 1;
        int cnt = 0;
        while(i <= j) {
            int sum = nums[i] + nums[j];
            if(sum <= limit) {
                i++;
                j--;
                cnt++;
            } else {
                j--;
                cnt++;
            }
        }

        return cnt;
    }
}