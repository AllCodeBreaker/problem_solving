class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            current = (current + nums[i] > nums[i]) ? current + nums[i] : nums[i];
            max = (current > max) ? current : max;
        }
        return max;
    }
}
