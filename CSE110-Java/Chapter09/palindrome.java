// 9.23


package Individual_Assignments.Chapter9;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("bob"));                        // will return   true
        System.out.println(isPalindrome("Bob"));                        // will return   false
        System.out.println(isPalindrome("never odd or even"));          // will return   true
        System.out.println(isPalindrome("good frog"));                  // will return   false
        
    }

    public static boolean isPalindrome(String input) {
        String noSpaceString = "";
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c != ' '){
                noSpaceString += c;
            }
            else {
                continue;
            }
        }
        // Error checking live
        //System.out.println(noSpaceString);
        
        String reversedString = "";
        for(int i = noSpaceString.length() - 1; i >= 0; i--){
            reversedString += noSpaceString.charAt(i);
        }
        // error checking live
        //System.out.println(reversedString);
        if(noSpaceString.equals(reversedString)){
            return true;
        }
        else {
            return false;
        }
    }
}