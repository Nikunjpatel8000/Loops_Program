import java.util.Scanner;

public class Palindrome_Number {

    public static void main(String[] args) {

        int revercInt = 0, second, realInt;//local variable

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter The Palindromes Number 11211) = ");//string value print
        int num = scanner.nextInt();//int value catch and store it

        realInt = num;//local variable

        // reversed integer is stored in variable
        while (num != 0)//while loop use for find num id not a zero
        {
            second = num % 10;//modulus of second variable
            revercInt = revercInt * 10 + second;
            num /= 10;
        }

        // palindrome if realInt and revercInt are equal
        if (realInt == revercInt)//if or true condition
            System.out.println("Number Is Palindrome = " + realInt);// String concatenations
        else//else or false condition ,And String Value Print
            System.out.println("Number Is Not A Palindrome = " + realInt);// String concatenations
    }
}
