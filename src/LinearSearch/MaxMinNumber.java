package LinearSearch;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Array is of Length: 10");

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Maximum Number of an array is: " + maxNum(numbers));
        System.out.println("Minimum Number of an array is: " + minNum(numbers));
        sc.close();

    }

    static int maxNum(int[] arr)
    {
        int maxElement = Integer.MIN_VALUE;

        if(arr.length == 0)
            return -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maxElement)
                maxElement = arr[i];
        }

        return maxElement;
    }

    static int minNum(int[] arr)
    {
        int minElement = Integer.MAX_VALUE;

        if(arr.length == 0)
            return -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < minElement)
                minElement = arr[i];
        }

        return minElement;
    }
}
