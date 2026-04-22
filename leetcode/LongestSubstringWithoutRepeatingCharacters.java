class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int w, l=0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        for (int r=0; r<n;r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            w = (r-l+1);
            if(w > longest){
                longest= w;
            }
            
        }
        return longest;
    }
}
