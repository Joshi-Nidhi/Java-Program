/*
 * 
https://www.geeksforgeeks.org/remove-duplicates-from-a-sorted-linked-list/
https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/

 */
package removeduplicatefromarray;

import java.util.Arrays;


public class RemoveDuplicateFromArray
{
    public static void main (String[] args) {  
        int arr[] = {10,20,20,60,40,70,60,30,50,40,30,50};  
        int length = arr.length;  
        Arrays.sort(arr);
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  

public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
//        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
         }  
        arr[j++] = arr[n-1];     
        // Changing original array  
//        for (int i=0; i<j; i++){  
//            arr[i] = temp[i]; 
//        }  
        return j;  
    }  
       
}

    
