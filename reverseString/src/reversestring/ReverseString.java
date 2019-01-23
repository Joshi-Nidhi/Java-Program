/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author nidhi
 */
public class ReverseString {

    static int i;

    static void stringreverse(String s) {
        char ch[] = new char[s.length()];

        for (i = s.length() - 1; i >= 0; i--) {
//        System.out.println("ch : "+ch[i]);
            ch[i] = s.charAt(i);
            System.out.print(ch[i]);
        }
    }

    public static void main(String args[]) {
        System.out.println("Original String is : ");
        System.out.println("my name is lakhan ");
        ReverseString.stringreverse(" my name is lakhan ");
    }
}
