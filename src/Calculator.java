import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int ans = 0;
       

        //Take input from user until the X or x is not printed
        while(true)
        {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.print("Enter operator: ");
            char op = sc.next().trim().charAt(0);
            System.out.println("Press 'X' or 'x' to exit...");
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                if(op == '+')
                {
                   ans = num1 + num2;
                }
                if(op == '-')
                {
                    ans = num1 - num2;
                }
                if(op == '*')
                {
                    ans = num1 * num2;
                }
                if(op == '/')
                {
                    if(num2 != 0)
                    {
                        ans = num1 / num2;
                    }

                }
                if(op == '%')
                {
                    ans = num1 % num2;
                }
            }
            else if(op == 'X' || op == 'x')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Operator");
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
