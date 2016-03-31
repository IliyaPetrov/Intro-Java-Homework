import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        System.out.println("Enter three numbers to get the average");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.printf("The average number is %.2f", getAvg(a, b, c));
    }

    public static double getAvg(double a, double b, double c) {
        double avgNum = (a + b + c) / 3;
        return avgNum;
    }
}
