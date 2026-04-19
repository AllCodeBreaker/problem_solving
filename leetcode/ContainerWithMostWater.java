class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        int w, min,a ;

        while(left < right){
            w = right-left;
            min = (height[left] < height[right])? height[left]: height[right];
            a = w*min;
            if(a > max){
                max = a;
            }

            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
    }
}
