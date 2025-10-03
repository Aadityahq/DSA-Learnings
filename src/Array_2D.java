public class Array_2D {
    public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];

//        System.out.print("Enter the elements: ");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for(int num : arr)
//        {
//            System.out.println(num);
//        }
//
//         Input elements
//        Scanner sc2 = new Scanner(System.in);
//
//        int[][] arr = new int[3][3];
//        System.out.println(arr.length);


//        for(int row = 0; row < arr.length; row++)
//        {
//            for(int col = 0; col < arr[row].length; col++)
//            {
//                arr[row][col] = sc2.nextInt();
//            }
//        }
//
        //Output the 2D array

//        for (int[] ints : arr) {
//            for (int col = 0; col < ints.length; col++) {
//                System.out.print(ints[col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row = 0; row < arr.length; row++)
//        {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        int[][] array = {
                {1 ,3 ,6, 7},
                {2, 5},
                {12, 55, 77, 99, 44}
        };

        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                System.out.print(array[row][col]+ " ");
            }
            System.out.println();
        }




    }
}
