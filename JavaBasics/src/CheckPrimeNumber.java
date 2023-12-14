import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter the number");
        int given_number = input.nextInt();
        int count = 2;
        boolean isPrime = false;

        while(count < given_number){

            if(given_number % count == 0){

                isPrime = true;
                break;

            }
            else {

                count++;
            }

        }

        if (isPrime == true){
            System.out.println("The given number "+ given_number + " is a prime number");
        }
        else {
            System.out.println("The given number "+ given_number + " is not a prime number");
        }

    }

}
