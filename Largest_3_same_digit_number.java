class Largest_3_same_digit_number {
    public String largestGoodInteger(String num) {
        int largeKey = -1;
        int length = num.length();

        for (int i = 0; i <= length - 3; i++) {
            
            if (num.charAt(i) == num.charAt(i + 1) &&
                num.charAt(i + 1) == num.charAt(i + 2)) {
                
                int number = num.charAt(i) - '0'; 

                if (number  > largeKey) {
                    largeKey = number;
                }
            }
        }

        if (largeKey == -1) {
            return ""; 
        }

        return String.valueOf(largeKey).repeat(3);
    }
  public static void main (String args[]){
     String str = "036844475";
     String repeated = largestGoodInteger(str);
     System.out.println("Input String: " + str);
     System.out.println("Output String: " + repeated);
  }
  
}
