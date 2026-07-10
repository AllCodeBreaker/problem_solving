// 242. Valid Anagram
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] characters = new int[26];
        for (int i = 0; i < s.length(); i++){
            characters[s.charAt(i) - 'a'] += 1;
            characters[t.charAt(i) - 'a'] -= 1;
        }
        for(int i = 0; i< characters.length; i++){
            if(characters[i] != 0){
                return false;
            }
        }
        return true;
    }

}
// Space O(1)
// Time O(n)
