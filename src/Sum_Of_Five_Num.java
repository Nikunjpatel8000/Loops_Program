import java.util.Scanner;

public class Sum_Of_Five_Num {

    static double total;//static variable & global variable

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The First Number = ");//print the string value
        int a = scanner.nextInt();// int value input & store
        System.out.print("Enter The Second Number = ");//print the string value
        int b = scanner.nextInt();// int value input & store
        System.out.print("Enter The Third Number = ");//print the string value
        int c = scanner.nextInt();// int value input & store
        System.out.print("Enter The Forth Number = ");//print the string value
        int d = scanner.nextInt();// int value input & store
        System.out.print("Enter The Fifth Number = ");//print the string value
        int e = scanner.nextInt();// int value input & store

        total = a + b + c + d + e;//total of five numbers

        System.out.print("Addition Of Five Number = " + total);// String concatenations

    }


}
