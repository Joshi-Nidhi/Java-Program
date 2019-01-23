/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author nidhi
 */
import java.util.*;

class PalindromeExample2 {

    public static void main(String args[]) {
        String original, reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String/Number : ");
        original = sc.nextLine();
//        int length = original.length();
        for(int i = (original.length())-1; i >=0; i--)
        {
            reverse= reverse+ original.charAt(i);
            
        }
        System.out.println("reverse : "+reverse);
        if(original.equals(reverse))
        {
            System.out.println("paindrome");
        }
        else
        {
            System.out.println("not a paindrome");
        }
        
        
        

    }
//        String original, reverse = ""; // Objects of String class  
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string/number to check if it is a palindrome");
//        original = sc.nextLine();
//        int length = original.length();
//        for (int i = length - 1; i >= 0; i--) {
//            System.out.println("original.charAt(i) "+ original.charAt(i));
//            reverse = reverse + original.charAt(i);
//        }
//        if (original.equals(reverse)) {
//            System.out.println("Entered string/number is a palindrome.");
//        } else {
//            System.out.println("Entered string/number isn't a palindrome.");
//        }
//    }
}
