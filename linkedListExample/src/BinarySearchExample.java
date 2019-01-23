
import java.util.Arrays;

//import java.util.Scanner;
// 
//class BinarySearch 
//{
//  public static void main(String args[])
//  {
//    int c, first, last, middle, n, search, array[];
// 
//    Scanner in = new Scanner(System.in);
//    System.out.println("Enter number of elements");
//    n = in.nextInt(); 
//    array = new int[n];
// 
//    System.out.println("Enter " + n + " integers");
// 
// 
//    for (c = 0; c < n; c++)
//      array[c] = in.nextInt();
// 
//    System.out.println("Enter value to find");
//    search = in.nextInt();
// 
//    first  = 0;
//    last   = n - 1;
//    middle = (first + last)/2;
// 
//    while( first <= last )
//    {
//      if ( array[middle] < search )
//        first = middle + 1;    
//      else if ( array[middle] == search ) 
//      {
//        System.out.println(search + " found at location " + (middle + 1) + ".");
//        break;
//      }
//      else
//         last = middle - 1;
// 
//      middle = (first + last)/2;
//   }
//   if ( first > last )
//      System.out.println(search + " isn't present in the list.\n");
//  }
//}

public class BinarySearchExample
{

    public static void binarySearch(int arr[], int first, int last, int key)
    {
        int mid = (first + last) / 2;

        while (first <= last)
        {
            if (arr[mid] < key)
            {
                first = mid + 1;
                System.out.println("first: "+first);
            } else if (arr[mid] == key)
            {
                System.out.println("Element is found at index: " + mid);
                break;
            } else
            {
                last = mid - 1;
            }
            mid = (first + last) / 2;
//            System.out.println("first: " + first);
//            System.out.println("last: " + last);
//            System.out.println("mid: " + mid);
        }
        if (first > last)
        {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String args[])
    {
        int arr[] =
        {
            10, 20, 30, 40, 50,80,60,70
        };
        int key = 60;
        int last = arr.length - 1;
        Arrays.sort(arr);
//      System.out.println("length: "+(arr.length));
//      System.out.println("last: "+last);
        binarySearch(arr, 0, last, key);
    }
}
