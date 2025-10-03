import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
        sc.close();
    }
    static boolean isPrime(int n)
    {
        if(n <= 1) {
            return false;
        }
        int i = 2;
        while(i * i <= n)
        {
            if(n % i == 0)
                return false;
            i++;
        }
        return true; //or we can write return i * i > n;

    }
}
