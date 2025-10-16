class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap <Character, Integer> actualJewel = new HashMap<>();
        int count = 0;
        for (char j : jewels.toCharArray()){
            actualJewel.put(j,1);
        }
        for(char s : stones.toCharArray()){
            if(actualJewel.containsKey(s)){
                count++;
            }
        }
        return count;
    }
}
