import java.util.Scanner;

public class Count_Positive_Zero_Negative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner

        int number, num,//local variable
                countPositive = 0,//local variable
                countNegative = 0,//local variable
                countZero = 0;//local variable

        System.out.print("Enter The Start Number = ");//print the string value
        number = scanner.nextInt();//int value catch and store it

        System.out.print("Enter The End Number = ");//print the string value
        num = scanner.nextInt();//int value catch and store it

        for (int i = number; i <= num; i++) {//for loop use for find positive and negative and zero number
            System.out.println(i);

            if (i > 0) {//if condition or true
                countPositive++;//count positive num
            } else if (i < 0) {
                countNegative++;//count negative num
            } else {//else and false condition
                countZero++;//count zero  num
            }
        }
        System.out.println("Positive Numbers Is = " + countPositive);// String concatenations
        System.out.println("Negative Numbers Is = " + countNegative);// String concatenations
        System.out.println("Zero Numbers Is = " + countZero);// String concatenations
    }

}
