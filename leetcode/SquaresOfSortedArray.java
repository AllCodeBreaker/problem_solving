//977. Squares of a Sorted Array

class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int current = nums.length-1;
        int left =0, right = nums.length-1;

        while(left<=right){
            
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result [current] = nums[left] * nums[left];
                left++;
            } else {
                result [current] = nums[right] * nums[right];
                right--;
            }
            current--;
        }
        return result;
    }
        
}
// Space O(n)
// Time O(n)
