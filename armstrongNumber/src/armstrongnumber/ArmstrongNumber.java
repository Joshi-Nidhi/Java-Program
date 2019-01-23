/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongnumber;

/**
 *
 * @author nidhi
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        int c = 0, a, temp;
        int n = 153;//It is the number to check armstrong  
        temp = n;
        while (n > 0) {
            System.out.println("n : "+n);
            a = n % 10;
            System.out.println("a : "+a);
            n = n / 10;
//            System.out.println("n2 : "+n);
            c = c + (a * a * a);
//            System.out.println("c : "+c);
        }
        if (temp == c) {
            System.out.println("armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
    }
}
