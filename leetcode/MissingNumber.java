class MissingNumber{
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int expected = n * (n + 1) / 2 , actual = 0;
        for(int i = 0; i < n; i++){
            actual += nums[i];
        }
        return expected - actual ;
    }
}
