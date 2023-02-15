package SeminarsHW.HW2;
import java.util.Scanner;


public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = true;
        int num1 = scanner.nextInt();        
        while (n-2 >= 0) {
            int num2 = scanner.nextInt();            
            if (num1 > num2) {
                flag = false;
            }
            num1 = num2;            
            n--;
        }
        scanner.close();
        System.out.println(flag);
    }
}
