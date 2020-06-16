import java.util.Scanner;

public class Multiplication_Table {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter Start Number = ");//print the string value
        int num = scanner.nextInt();//int value catch and store it
        System.out.print("Enter And Number = ");//print the string value
        int num2 = scanner.nextInt();//int value catch and store it
        int i=1;//localm variable
        do{//do-while loop
            int j=1;
            do{
                System.out.print(i*j+"  ");//print the string value
                j++;// i value increments value by 1
            }while(j<=num || j <= num2);//while condition check And or logical operator
            i++;// i value increments value by 1
            System.out.println();
        }while(i<=num || i <= num2);//while condition check And or logical operator

    }

}
