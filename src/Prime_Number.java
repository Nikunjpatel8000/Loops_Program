import java.util.Scanner;

public class Prime_Number {

    public static void main(String args[]) {
        int prime; //local variable
        boolean isPrime = true;//local variable & conditional expressions

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter Any Number = ");//print the string value

        //capture the input in an integer
        int a = scanner.nextInt();//int value catch & store it
        scanner.close();//scanner object process close here
        for (int i = 2; i <= a / 2; i++) {
            prime = a % i;
            if (prime == 0) {//if or true condition
                isPrime = false;//false condition
                break;//stop the process
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime)//if or true condition
            System.out.println("Enter Number Is Prime = " + a);// String concatenations
        else//else or false condition
            System.out.println("Enter Number Is Not Prime = " + a);// String concatenations
    }

}
