class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        double average;
        for (int i=0; i<k; i++){
            sum = sum + nums[i];
        }
        average = (double) sum/k;
        for (int i=k; i<n;i++){
            sum = sum + nums[i] - nums[i-k];
            if ((double)sum/k > average){
                average = (double) sum/k;
            }
        }
        return average;
    }
}
