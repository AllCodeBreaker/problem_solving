// 169. Majority Element
class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> frequency = new HashMap<>();
        int maxFreq = 0, maxVal = 0;
        for(int x: nums){
            if(frequency.containsKey(x)){
                frequency.put(x, frequency.get(x)+1);
            } else {
            frequency.put(x, 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: frequency.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxVal = entry.getKey();
            }
        }
            
        return maxVal;
    }
}

