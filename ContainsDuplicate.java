class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length, i;
        HashMap <Integer, Boolean> hashmap = new HashMap<>();
        for(i=0;i<length;i++){
            if(hashmap.containsKey(nums[i])){
                return true;
            }else{
                hashmap.put(nums[i], true);
            }
        }
        return false;
    }
}
