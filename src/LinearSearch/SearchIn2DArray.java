package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[4][4];
        System.out.println("Enter elements in size of row of Array is  " + nums.length +  " : ");
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for(int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }

        System.out.print("Enter a target element to search: ");
        int target = sc.nextInt();
        int[] result = searchIn2D(nums, target); //output format is {row, col}
        System.out.println("Target found: "+ Arrays.toString(result));

        System.out.println("Maximum element in 2D Array is : " + max(nums));
    }

    static int[] searchIn2D(int[][] num, int target)
    {
        for(int i = 0; i < num.length; i++)
        {

            for(int j = 0; j < num[i].length; j++)
            {
                if(num[i][j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] num)
    {
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num[i].length; j++)
            {
                if(num[i][j] > maxElement)
                {
                    maxElement = num[i][j];
                }
            }
        }
        return maxElement;
    }
}
