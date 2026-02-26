// useCase 2: HardCodePalindrome
public class PalindromeCheckerApp {
     public static void main (String[] args){
         System.out.println("Welcome to Palindrome Checker AppManagement System");
         System.out.println("Modify this logic to usecase 2");

         // Hardcoded string
         String input = "madam";

         boolean isPalindrome = true;

         // Loop only till half of the string length
         for (int i = 0; i < input.length() / 2; i++) {

             // Compare characters from both ends
             if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                 isPalindrome = false;
                 break;
             }
         }

         // Display result
         if (isPalindrome) {
             System.out.println(input + " is a palindrome.");
         } else {
             System.out.println(input + " is not a palindrome.");
         }

     }
}
