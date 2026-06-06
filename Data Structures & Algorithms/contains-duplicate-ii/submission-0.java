class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int curr = nums[i];
            if(map.containsKey(curr)) {
                if(i - map.get(curr) <= k) return true;
            }
            map.put(curr, i);
        }

        return false;
    }
}