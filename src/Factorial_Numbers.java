import java.util.Scanner;

public class Factorial_Numbers {
    static int number;//static and global variable

    public static void main(String[] args) {

        System.out.print("Enter the number: ");//string value print
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        number = scanner.nextInt();//int value catch and store it
        scanner.close();//scanner process stop it
        long a = 1;//local variable
        int b = 1;//local variable
        while(b<=number)//while condition check number is factorial
        {
            a = a * b;
            b++;
        }
        System.out.print("Factorial of "+number+" is: "+a);//string concatenation
    }



}
