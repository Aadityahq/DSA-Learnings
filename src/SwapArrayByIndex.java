import java.util.Arrays;

public class SwapArrayByIndex {
    public static void main(String[] args) {

        int[] arr = {23, 56, 75, 34, 22, 46, 67};
        //swap(arr, 3, 4);
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] array, int index1 , int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void revArr(int[] array)
    {
        int start = 0;
        int end = array.length - 1;

        while(start < end)
        {
            swap(array,start,end);
            start++;
            end--;
        }
    }

}
