/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author nidhi
 */
class fibonacci {

    public static void main(String args[]) {
        long n1 = 0, n2 = 1, n3, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = sc.nextInt();
//        count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1    

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }

//        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed    
        //        {
        //            n3 = n1 + n2;
        //            System.out.print(" " + n3);
        //            n1 = n2;
        //            n2 = n3;
        //        }
  
    }
}
