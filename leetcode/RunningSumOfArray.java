//1480. Running Sum of 1d Array (easy)

class RunningSumOfArray {
    public int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }
}

//Space O(n)
//Time O(n)
