//125. Valid Palindrome
class ValidPalindrome {
    public boolean isPalindrome(String s) {

        if(s.equals("")){
            return true;
        }

        int left = 0, right = s.length() -1;

        while(left < right){
            if(s.charAt(left) == ' ' || !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }else if(s.charAt(right) == ' ' || !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                right--;
                left++;
            }
        }
        return true;
    }
}

// Space O(1)
// Time O(n)
