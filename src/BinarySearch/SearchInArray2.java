package BinarySearch;

import java.util.Scanner;

public class SearchInArray2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[8];

        System.out.print("Enter the " + num.length + " elements in descending order: ");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        sc.close();

        int ans = binarySearch2(num, target);
        if(ans == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("The element found at the index: " + ans);
        }
    }

    //Search in descending order sorted array;
     static int binarySearch2(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

         while(start <= end)
         {
             //find the middle element
             //mid = (start + end) / 2;  // this might exceed the int range;
             int mid = start + (end - start) / 2;

             if(target < arr[mid])
             {
                 start = mid + 1;
             }
             else if(target > arr[mid])
             {
                 end = mid - 1;
             }
             else
             {
                 return mid;
             }
         }
         return -1;
     }

}
