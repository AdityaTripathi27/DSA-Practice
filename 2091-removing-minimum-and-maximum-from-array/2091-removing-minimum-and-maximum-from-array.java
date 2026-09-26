class Solution {
    public int minimumDeletions(int[] nums) {
        
        int n = nums.length;
        
        int min = 0;
        int max = 0;
        
        // Find indexes of minimum and maximum
        for(int i = 0; i < n; i++) {
            if(nums[i] < nums[min]) {
                min = i;
            }
            
            if(nums[i] > nums[max]) {
                max = i;
            }
        }
        
        // Make min the left index
        int left = Math.min(min, max);
        int right = Math.max(min, max);
        
        // 1. Delete both from front
        int front = right + 1;
        
        // 2. Delete both from back
        int back = n - left;
        
        // 3. Delete left from front and right from back
        int both = (left + 1) + (n - right);
        
        return Math.min(front, Math.min(back, both));
    }
}