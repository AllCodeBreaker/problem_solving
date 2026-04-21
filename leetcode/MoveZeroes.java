class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insert = 0;
        int length= nums.length;
        for (int i=0; i<length; i++){
            if(nums[i] !=0){
                nums[insert] = nums[i];
                insert++;
            }
        }

        while (insert < length){
            nums[insert] = 0;
            insert++;
        }
    }
}
