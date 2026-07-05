//724. Find Pivot Index

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        
        prefix[0] = nums[0];
        for(int i=1; i<len; i++){
            prefix[i] = prefix [i-1] + nums[i];
        }

        suffix [len-1] = nums[len-1];
        for(int i = len-2; i>=0; i--){
            suffix[i] = suffix[i+1] + nums[i];
        }

        //calculate pivot
        for (int i = 0; i<len; i++){
            int left = (i==0)? 0 : prefix[i-1];
            int right = (i==len-1)? 0 : suffix[i+1];
            if (left == right){
                return i;
            }
        
        }
        return -1;
    }
}

//Time O(n)
//Space O(n)