import java.util.Scanner;

public class Possitive_Num_Multiplication_Table {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter Number = ");//print the string value
        int num = scanner.nextInt();// String value input & store

        for(int i=1; i <= 10; i++)//for loop use for multiplication of i & j
        {
            System.out.println(num + " * "+ i +" = "+ num * i );// String concatenations
        }
    }

}
