/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformarray;

/**
 *
 * @author nidhi
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class TransformArray
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = s.nextInt();
            s.nextLine();
            int[] arr = new int[n];
            int m = 0;
            String[] temp = s.nextLine().trim().split(" ");
            for (int j = 0; j < n; j++)
            {
                arr[j] = Integer.parseInt(temp[j]);
            }
            for (int k = 0; k < n - 1; k++)
            {
                if (arr[k] == 0)
                {
                    continue;
                } else
                {
                    for (int l = k + 1; l < n; l++)
                    {
                        if (arr[l] == 0)
                        {
                            continue;
                        } else
                        {
                            if (arr[k] == arr[l])
                            {
                                //  System.out.print("yolo");
                                arr[k] = 2 * arr[k];
                                arr[l] = 0;
                                k--;
                            }
                            break;

                        }
                    }
                }

            }
            //  for(int k=0;k<n-1;k++){
            //       if(arr[k+1]!=0 && arr[k]==arr[k+1]){ 
            //          arr[k]=2*arr[k];
            //          arr[k+1]=0;
            //          System.out.print(arr[k]+" ");
            //          m++;
            //      }
            //      else
            //      if (arr[k]!=0){
            //          System.out.print(arr[k]+" ");
            //          m++;
            //      }
            //  }
            for (int p = 0; p < n; p++)
            {
                if (arr[p] != 0)
                {
                    System.out.print(arr[p] + " ");
                    m++;
                }
            }
            for (int l = m; l < n; l++)
            {
                System.out.print(0 + " ");
            }
            System.out.println();

        }

    }
}
