import java.util.Scanner;

public class Armstrong_Number {

    static int a, b, c;


    public static void main(String[] args) {

        int total = 0;//local variable
        Scanner scanner = new Scanner(System.in);// Input value And Create a object of scanner
        System.out.print("Ënter The Number(3^3) = ");//string value print
        a = scanner.nextInt();//int value catch and store it
        scanner.close();//scanner process close it
        b = a;
        //0-9999 in arm strong number is 0,1,153,307,371,407,1634
        for (; b != 0; b /= 10) {//for loop for find Armstrong number
            c = b % 10;
            total = total + c * c * c * c;//total multiplication by c
        }
        if (total == a)//if - true condition
            System.out.print("Number Is Armstrong = ");//string value print
        else//else or false condition
            System.out.print("Number Is Armstrong = ");//string value print
    }


}
