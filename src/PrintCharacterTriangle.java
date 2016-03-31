import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (char i = 'a'; i<(char)(a+97);i++  ){
            for(char ch = 'a'; ch<=i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        for (char i = (char)(a+95); i>='a'; i-- ){
            for (char ch = 'a'; ch<=i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

        }

        }



