package BinarySearch;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[15];

        System.out.print("Enter the " + num.length + " elements in ascending order: ");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        sc.close();

        int ans = binarySearch(num, target);
        if(ans == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("The element found at the index: " + ans);
        }

    }

    //return the index
    //return -1 if element not found

    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;

        while(start <= end)
        {
            //find the middle element
            //mid = (start + end) / 2;  // this might exceed the int range;
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
