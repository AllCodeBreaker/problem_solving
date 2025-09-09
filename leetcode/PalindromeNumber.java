class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int reverse = 0, x_temp = x,r;
        
        while (x_temp>0){
            r = x_temp % 10;
            reverse = (reverse*10) + r;
            x_temp = x_temp/10;
        }
        if (x == reverse){
            return true;
        }else{
            return false;
        }
    }
}
