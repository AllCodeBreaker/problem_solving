// 350. Intersection of Two Arrays II
class IntersectionOfTwoArrayII{
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i= 0; i<nums1.length; i++){
            if(seen.containsKey(nums1[i])){
                seen.put(nums1[i], seen.get(nums1[i])+1);
            }else{ 
                seen.put(nums1[i], 1);
            }
        }
        for(int j=0; j<nums2.length;j++){
            if(seen.containsKey(nums2[j])){
                if(seen.get(nums2[j]) > 0){
                    seen.put(nums2[j], seen.get(nums2[j]) -1);
                    answer.add(nums2[j]);
                }
            }
        }
        int [] ansArray = new int[answer.size()];
        int index = 0;

        for(int x : answer){
            ansArray[index++] = x;
        }

        return ansArray;
        
    }
}
