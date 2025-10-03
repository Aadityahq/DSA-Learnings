package LinearSearch;

public class evenDigit {
    public static void main(String[] args) {

        int[] nums = {23,5363,356,23442,534623,33, 446,3222};
        System.out.println(evenCount(nums));

        System.out.println(countDigits(32322207));
    }

    static int evenCount(int[] arr) {

        int evenCount = 0;
        for(int n : arr)
        {
            if(even(n))
                evenCount++;

        }
        return evenCount;
    }

    private static boolean even(int n) {

        int numOfDigits = countDigits(n);
       /* if(numOfDigits % 2 == 0)
        {
            return true;
        }
        return false;

        */
        return numOfDigits % 2 == 0;
    }


    //count number of digits
    static int countDigits(int n) {

        if(n < 0)
            n = n * -1;
        if(n == 0)
            return 1;

        int count = 0;
        while(n > 0)
        {
            count++;
            n = n /10;
        }
       return count;
    }

    //count number of digits 2nd way
    static int countDigits2(int n)
    {
        if(n < 0)
            n = n * -1;
        if(n == 0)
            return 1;

        return (int)(Math.log10(n)) + 1;
    }
}
