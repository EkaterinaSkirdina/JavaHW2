package SeminarsHW.HW2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summ = 0;
        while (n > 0) {
            int num = scanner.nextInt();
            if (checkSimple(num)) {
                summ += num;
            }
            n--;
        }
        scanner.close();
        System.out.println(summ);
    }

    public static boolean checkSimple(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
