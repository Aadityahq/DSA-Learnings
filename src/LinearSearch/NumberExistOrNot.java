package LinearSearch;

import java.util.Scanner;

public class NumberExistOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Array is of Length: 10");

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter a target: ");
        int target = sc.nextInt();

        int find = targetFind(numbers, target);

        System.out.println("Does number found: at Index " + find);
    }

    static int targetFind(int[] array, int target)
    {
        int n = array.length;
        boolean flag = false;

        if(n == 0) {
            return -1;

        }

        for (int i = 0;  i < n; i++) {
            if (array[i] == target)
                return i;


        }
        return -1;
    }
}
