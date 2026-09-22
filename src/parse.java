import java.util.*;

public class parse {
    public static void main(String[] args) {
        //convert int to string
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num1 = input.nextInt();

        Integer obj = new Integer(num1);
        String str = obj.toString();

        System.out.println("\n String str has a value of: " + str);


    }

}
