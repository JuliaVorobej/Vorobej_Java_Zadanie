package algoritms;

import java.util.Scanner;

public class Algoritm2 {
    public static void alg2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String b = scanner.nextLine();
        if (b.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

