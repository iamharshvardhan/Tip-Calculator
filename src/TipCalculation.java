import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculation {
    public static Scanner scanner = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private static double bill;
    private static double tipPercent;
    private static int people;
    private static double totalTip;
    private static String splitTip;
    
    public static void entry() {
        System.out.print("What was the total bill? $");
        bill = scanner.nextDouble();

        System.out.print("What Percentage tip would you like to give? 10, 12, or 15? ");
        tipPercent = scanner.nextDouble();

        System.out.print("How many people to split the bill? ");
        people = scanner.nextInt();
    }

    public static void calculate() {
        totalTip = ((bill * tipPercent) / 100) + bill;
        splitTip = df.format(totalTip / people);

        System.out.println("Each person should pay: $" + splitTip);
    }

}
