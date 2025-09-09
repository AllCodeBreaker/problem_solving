class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int index =0, length= nums.length;
        for (int i=1; i<length;i++){
            if(nums[index] != nums[i]){
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }
}
