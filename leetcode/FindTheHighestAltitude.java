//1732. Find the Highest Altitude

class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int previous = 0; //initial altitude 
        int max = previous;
        
        for (int i= 0; i<gain.length; i++){
            previous= previous+gain[i];
            if(previous > max){
                max = previous;
            }
        }
        return max;
    }
}
//Time O(n)
//Space O(1)