import java.util.Scanner;

public class GWA_Ethann {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, sci, eng, fil, comp;
        float gwa;

        System.out.print("Enter your Math Grade: ");
        math = input.nextInt();
        System.out.print("Enter your Science Grade: ");
        sci = input.nextInt();
        System.out.print("Enter your English Grade: ");
        eng = input.nextInt();
        System.out.print("Enter your Filipino Grade: ");
        fil = input.nextInt();
        System.out.print("Enter your Computer Grade: ");
        comp = input.nextInt();
        
        gwa = ((math * 3) + (sci * 3) + (eng * 2) + (fil * 2) + (comp * 2)) / 12;
        System.out.println("\nSubjects       Final Grade       Credit Unit");
        System.out.println("Mathematics       " + math + "                  3");
        System.out.println("Science           " + sci + "                  2");
        System.out.println("English           " + eng + "                  2");
        System.out.println("Filipino          " + fil + "                  2");
        System.out.println("Computer          " + comp + "                  2");
        System.out.printf("                %.2f", gwa);
        System.out.print("                12");

        input.close();
    }
}
