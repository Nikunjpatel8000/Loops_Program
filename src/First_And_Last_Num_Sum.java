import java.util.Scanner;

public class First_And_Last_Num_Sum {

    static double total;

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

        total = a + e;//total of first and last digits

        System.out.print("Addition Of First & Five Number = " + total);// String concatenations

    }






}
