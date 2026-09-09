
import java.util.Scanner;

public class LastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;

        System.out.println(lastDigitA + lastDigitB);

        sc.close();
    }
}

