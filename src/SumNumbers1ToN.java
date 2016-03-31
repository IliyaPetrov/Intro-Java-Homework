import java.util.Scanner;

public class SumNumbers1ToN {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<=number; i++) {
            sum+=i;
        }
        System.out.println(sum);


    }
}
