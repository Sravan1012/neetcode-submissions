class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int cnt = 1;

        int l = 0, r = 0;
        while(r < n) {
            if(nums[l] == nums[r]) r++;
            else {
                l++;
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r++;
                cnt++;
            }
        }

        return cnt;
    }
}