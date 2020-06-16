import java.util.Scanner;

public class Number_Vowel {
    static int vowels = 0, digits = 0;//static & global variable
    static double percentage;//static & global variable

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Input value And Create a object of scanner
        System.out.print("Enter The Name With Number = ");//print the string value
        String name = scanner.next();// String value input & store
        name = name.toLowerCase();//lower value allowed

        for (int i = 0; i < name.length(); ++i) {//for loop
            char ch = name.charAt(i);// char value input & store
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')//if else condition
            {
                ++vowels;//vowels numbers count
            } else if (ch >= '0' && ch <= '9')//else or false condition
            {
                ++digits;//digits numbers count
            }
        }
        System.out.println("Number Of Vowels = " + vowels + " (" + vowels + percentage + "%) ");// String concatenations
        System.out.println("Number Of Digits = " + digits + " (" + digits + percentage + "%) ");// String concatenations
    }

}
