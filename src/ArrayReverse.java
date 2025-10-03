import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {23, 56, 75, 34, 22};
        revArr(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void revArr(int[] array)
    {
        int start = 0;
        int end = array.length - 1;

        while(start < end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
