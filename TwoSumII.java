class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        int res=0;
        while (start < end){
            res = numbers[start] + numbers[end];
            if(res == target){
                return new int [] {start+1, end+1};
            }else if(res < target ){
                start += 1;
            }else{
                end -= 1;
            }
        }
        return new int[]{-1};
    }
}
