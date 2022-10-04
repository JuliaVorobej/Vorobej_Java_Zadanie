package algoritms;

import java.util.Scanner;

public class Algoritm3 {
    public static void alg3() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
