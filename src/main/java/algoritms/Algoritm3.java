package algoritms;

import java.util.Scanner;

public class Algoritm3 {
    public static void alg3() {
        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        System.out.print("Заполните массив: ");
        String a = scanner.nextLine().trim();
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(a.split(" ")[i]);
        }
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
