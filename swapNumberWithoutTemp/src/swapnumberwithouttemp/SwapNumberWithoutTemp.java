/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnumberwithouttemp;

/**
 *
 * @author nidhi
 */
public class SwapNumberWithoutTemp
{

    public static void main(String[] args)
    {
        // TODO code application logic here

        int a = Integer.MAX_VALUE; //0010 in binary
        int b = 2147483646; //0100 in binary

        System.out.println(" before swapping, a: " + a + " b: " + b);

//swapping value of two numbers without using temp variable and XOR bitwise operator     
//        a = a ^ b; 
//        b = a ^ b; 
//        a = a ^ b; 


        a = a + b; 
        b = a - b; 
        a = a - b; 

//a = (a + b) - (b = a);

        System.out.println(" after swapping , a: " + a + " b: " + b);
    }

}
