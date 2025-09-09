class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int length = nums.length;
        int complement;

        for (int i = 0; i < length; i++) {
            complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { i, seen.get(complement) };
            }
            seen.put(nums[i], i);
        }

        
        throw new IllegalArgumentException("No Solution for Two Sum");
    }
}
