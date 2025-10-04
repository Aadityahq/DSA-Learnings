package BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[8];

        System.out.print("Enter the " + num.length + " elements: ");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        sc.close();

        int ans = orderAgnostic(num, target);
        if(ans == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("The element found at the index: " + ans);
        }
    }

    static int orderAgnostic(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;

        //find the whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end)
        {
            //find the middle element
            //mid = (start + end) / 2;  // this might exceed the int range;
            int mid = start + (end - start) / 2;

            if(target == arr[mid])
                return mid;

            //if array is sorted in ascending order
            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else if(target > arr[mid])
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
