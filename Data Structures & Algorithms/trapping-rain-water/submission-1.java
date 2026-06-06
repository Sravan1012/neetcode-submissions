class Solution {
    public int trap(int[] height) {
        int lmax = 0, rmax = 0;
        int cap = 0;
        int n = height.length;
        int l = 0, r = n - 1;

        while(l <= r) {
            if(height[l] > height[r]) {
                if(height[r] > rmax) {
                    rmax = height[r];
                } else {
                    cap += rmax - height[r];
                }
                r--;
            } else {
                if(height[l] > lmax) {
                    lmax = height[l];
                } else {
                    cap += lmax - height[l];
                }
                l++;
            }
            System.out.println(cap);
        }

        return cap;
    }
}
