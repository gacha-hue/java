import java.util.*;

public class parse1 {
    public static void main(String[] args) {
        //convert string to int
        String str;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any string you want to convert to integer.");
        str = input.next();

        int X = Integer.parseInt(str);
        System.out.println("x * x = " + X * X);


    }
}
