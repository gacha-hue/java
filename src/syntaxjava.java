import java.util.*;
public class syntaxjava {
    public static void main (String[] args) {
        int num1, num2, sum;
        Scanner number = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        num1 = number.nextInt();
        System.out.println("Enter second integer: ");
        num2 = number.nextInt();

        sum = num1 + num2;
        System.out.println("The sum of the integers is: " + sum);
    }
}
