// 349. Intersection of Two Arrays
class IntersectionOfTwoArrays{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> seen = new HashSet<>();
        HashSet <Integer> answer = new HashSet<>(); 
        int index =0;

        for(int i= 0; i<nums1.length;i++){
            seen.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(seen.contains(nums2[i])){
                answer.add(nums2[i]);
            }
        }

        int ansArray[] = new int [answer.size()];
        for(int x : answer){
            ansArray[index++] = x;
        }
        
        return ansArray;
    }
}
