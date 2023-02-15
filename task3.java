package SeminarsHW.HW2;
import java.util.Arrays;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        int[] myArray = getArray();
        System.out.println(Arrays.toString(myArray));
        int sumInd = sumIndexTwoDigitEl(myArray);
        int[] newArray = replaceElArray(myArray, sumInd);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static int sumIndexTwoDigitEl(int[] arr) {
        int sumIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 9 && arr[i] < 100) || (arr[i] < -9 && arr[i] > -100)) {
                sumIndex += i;
            }
        }
        return sumIndex;
    }

    public static int[] replaceElArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = num;
            }
        }
        return arr;
    }

}
