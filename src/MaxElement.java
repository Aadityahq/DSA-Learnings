public class MaxElement{
    public static void main(String[] args) {

        int[] arr = {23, 56, 75, 34, 22, 89, 56, 99, 100};

        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 2,5));
    }
    public static int max(int[] array)
    {
        int maxOfElement = -1;
        if(array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (maxOfElement < array[i])
                    maxOfElement = array[i];
            }
        }
        return maxOfElement;
    }

    public static int maxInRange(int[] array, int start, int end)
    {

        int maxOfElement = array[start];

        for (int i = start; i <= end; i++) {
            if (maxOfElement < array[i])
                maxOfElement = array[i];
        }
        return maxOfElement;
    }

}
