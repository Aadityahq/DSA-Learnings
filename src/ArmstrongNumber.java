import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

//        System.out.println("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean ans = isArmstrong(number);
//        System.out.println("Is it Armstrong number: " + ans);

        for(int i = 100; i < 1000; i++)
        {
            if(isArmstrong(i))
                System.out.println(i + " is an armstrong number");
        }
    }
    static boolean isArmstrong(int num)
    {
        int originalNumber = num;
        int sumOfNumbers = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sumOfNumbers += rem * rem * rem; // or Math.pow(rem, 3);
        }
        if(sumOfNumbers == originalNumber)
            return true;
        else
            return false;
    }
}
