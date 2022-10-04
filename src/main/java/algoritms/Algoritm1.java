package algoritms;

import java.util.Scanner;

public class Algoritm1 {
    public static void alg1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        if (a > 7) {
            System.out.println("Привет");
        }
    }
}
