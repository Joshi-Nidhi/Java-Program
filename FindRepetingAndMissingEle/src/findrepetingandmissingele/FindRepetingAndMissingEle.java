package findrepetingandmissingele;

public class FindRepetingAndMissingEle
{

    static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++)
        {
//            System.out.println("Math.abs(arr[i]). "+Math.abs(arr[i]));
//            System.out.println("1. "+arr[Math.abs(arr[i]) - 1]);
            if (arr[Math.abs(arr[i]) - 1] > 0)
            {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
//                System.out.println("if: "+arr[Math.abs(arr[i]) - 1]);
            } else
            {
                System.out.println("ELSE : "+Math.abs(arr[i]));
            }   // 7, 7, 4, 5, 5, 6, 2, 2
        }

        System.out.print("And the missing element is ");
        for (i = 0; i < size; i++)
        {
            if (arr[i] > 0)
            {
                System.out.println(i + 1);
            }
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] =
        {
            7, 7, 7, 5, 5, 6, 2, 2
        };
        int n = arr.length;
        printTwoElements(arr, n);
    }
}
