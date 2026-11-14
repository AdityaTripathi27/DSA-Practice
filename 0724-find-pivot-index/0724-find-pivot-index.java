class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int pref[] = new int[n];
        int suff[] = new int[n];

        int sum = 0;

        // Calculate Prefix Sum
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            pref[i] = sum;
        }

        sum = 0;

        // Calculate Suffix Sum
        for(int i = n-1; i >= 0; i--) {
            sum += nums[i];
            suff[i] = sum;
        }

        // Find Pivot Index
        for(int i = 0; i < n; i++) {

            int left = (i == 0) ? 0 : pref[i-1];

            int right = (i == n-1) ? 0 : suff[i+1];

            if(left == right) {
                return i;
            }
        }

        return -1;
    }
}