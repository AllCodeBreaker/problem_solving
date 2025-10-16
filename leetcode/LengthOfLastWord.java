class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = s.length()-1;
        while (s.charAt(len) == ' '){
            len--;
        }
        //len after removing space at end 
        int last = len;
        while(last >= 0 && s.charAt(last) != ' '){
            last--;
        }

        return len - last ;
    }
}
