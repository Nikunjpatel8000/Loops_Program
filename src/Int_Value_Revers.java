import java.util.Scanner;

public class Int_Value_Revers {
    static int a = 0;//static and global variable
    static int b = 0;//static and global variable

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Enter The Number = ");//string value print
        a = scanner.nextInt();//int value catch and store it
        while( a > 0 )//while condition
        {
            b = b * 10 + a % 10;
            a = a /10 ;
        }

        System.out.print("Reverse number is: " + b );//string concatenation
    }


}
