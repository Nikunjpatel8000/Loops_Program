import java.util.Scanner;

public class Sum_And_Odd_Even_Num {

    static double total;
    static int
    countEven = 0,
    countOdd = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter The First Number = ");//print the string value
        int a = scanner.nextInt();
        System.out.print("Enter The Second Number = ");//print the string value
        int b = scanner.nextInt();
        System.out.print("Enter The Third Number = ");//print the string value
        int c = scanner.nextInt();
        System.out.print("Enter The Forth Number = ");//print the string value
        int d = scanner.nextInt();
        System.out.print("Enter The Fifth Number = ");//print the string value
        int e = scanner.nextInt();

        total = a + b + c + d + e;//total of five numbers

        System.out.println("Addition Of Five Number Is = " + total);// String concatenations
        //if else condition numbers is even or odd count
        if (a % 2 == 0 )  {//if or true condition & print the string value
            countEven++;
        }  else {//else or false condition & print the string value
            countOdd++;
        }if (b % 2 == 0 )  {//if or true condition & print the string value
            countEven++;
        }  else {//else or false condition & print the string value
            countOdd++;
        }if (c % 2 == 0 )  {//if or true condition & print the string value
            countEven++;
        }  else {//else or false condition & print the string value
            countOdd++;
        }if (d % 2 == 0 )  {//if or true condition & print the string value
            countEven++;
        }  else {//else or false condition & print the string value
            countOdd++;
        }if (e % 2 == 0 )  {//if or true condition & print the string value
            countEven++;
        }  else {//else or false condition & print the string value
            countOdd++;
        }

        System.out.println("Even Numbers Is = " + countEven);// String concatenations
        System.out.println("Even Numbers Is = " + countOdd);// String concatenations
    }

}




