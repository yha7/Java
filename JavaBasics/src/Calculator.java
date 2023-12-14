import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter the operator ");
            char op = input.next().trim().charAt(0);

            int ans = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){

                System.out.println("Enter first number ");
                int number1 = input.nextInt();

                System.out.println("Enter second number ");
                int number2 = input.nextInt();

                if ( op == '+'){
                    ans = number1 + number2;
                }

                if ( op == '-'){
                    ans = number1 - number2;
                }
                if ( op == '*'){
                    ans = number1 * number2;
                }
                if ( op == '/'){
                    ans = number1 / number2;
                }
                if ( op == '%'){
                    ans = number1 % number2;
                }
            } else if ( op == 'x' || op == 'X') {

                System.out.println("Exit the program");
                break;

            } else {

                System.out.println("Invalid input !!!!");

            }
            System.out.println("The output is "+ans);
        }

    }
}
