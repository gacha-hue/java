import java.util.*;

public class ModifiedWorkPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours;
        float norpay, otpay, totpay;

        System.out.print("Enter the number of hours you've worked: ");
        hours = input.nextInt();

        switch (hours > 40 ? 1:0) {
            case 0:
                otpay = 0;
                norpay = hours * 75.00f;
                break;
            case 1:
                norpay = hours * 75.00f;
                otpay = (hours - 40) * (75.00f * 1.25f);
                break;
            default:
                norpay = 0;
                otpay = 0;
        }
        totpay = norpay + otpay;

        System.out.print("\n--- PAYSLIP ---");
        System.out.print("\nHours worked: " + hours + " hours");
        System.out.printf("\nYour normal pay is: Php %.2f", norpay);
        System.out.printf("\nYour overtime pay is: Php %.2f", otpay);
        System.out.printf("\nYour total pay is: Php %.2f", totpay);

        input.close();
    }
}
