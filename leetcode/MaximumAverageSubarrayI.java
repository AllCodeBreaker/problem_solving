class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        double avg = Double.NEGATIVE_INFINITY; //-1/0 

        for (int i = 0; i <= len - k; i++) {
            sum = 0;
            for (int j = 0; j < k; j++) {
                sum += nums[i + j];
            }
            avg = Math.max(avg, (double) sum / k);
        }

        return avg;
    }
}
